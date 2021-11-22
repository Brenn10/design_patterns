package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A medical record adaptor for health records.
 * @Author: Brennan Cain (Brenn10)
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;
    
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }
    
    public String getFirstName() {
        return record.getName().split(" ")[0];
    }

    public String getLastName() {
        return record.getName().split(" ")[1];
    }

    public Date getBirthday() {
        return record.getBirthdate();
    }

    public Gender getGender() {
        String gender = record.getGender();
        if (gender.equalsIgnoreCase("male")) {
            return Gender.MALE;
        } else if (gender.equalsIgnoreCase("female")) {
            return Gender.FEMALE;
        } else {
            return Gender.OTHER;
        }
    }

    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> history = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        for (String s : history) {
            String[] parts = s.split("\n");
            String date = parts[0].split(":")[1].trim();
            String well = parts[1].split(":")[1].trim();
            String description = parts[2].split(":")[1].trim();
            try {
                visits.add(new Visit(
                    simpleDateFormat.parse(date), 
                    Boolean.parseBoolean(well), 
                    description));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return visits;
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + simpleDateFormat.format(getBirthday()) + "\n";
        switch (getGender()) {
            case MALE:
                result += "Gender: MALE\n";
                break;
            case FEMALE:
                result += "Gender: FEMALE\n";
                break;
            case OTHER:
                result += "Gender: OTHER\n";
        }

        result += "Medical Visit History:\n";

        for (Visit visit : getVisitHistory()) {
            result += visit.toString() + "\n";
        }

        return result;
    }
}
