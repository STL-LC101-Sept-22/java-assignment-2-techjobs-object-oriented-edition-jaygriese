package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    //classes of their own
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
//
    @Override
    public boolean equals(Object o) {
        //
        if (this == o) return true;
        //
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }





    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

//    public String toString() {
//        ArrayList<Object>jobArray = new ArrayList<>();
//        jobArray.add(this.name);
//        jobArray.add(this.employer);
//        jobArray.add(this.location);
//        jobArray.add(this.positionType);
//        jobArray.add(this.coreCompetency);
//        String dna = "Data not available";
//        String fullString = "\n ID: 1 \n" +
//            " Name: " + this.name + "\n" +
//            " Employer: " + this.employer + "\n" +
//            " Location: " + this.location + "\n" +
//            " PositionType: " + this.positionType + "\n" +
//            " CoreCompetency: " + this.coreCompetency + "\n";
//        for (Object i : jobArray) {
//            if (this == null) {
//                jobArray(i).setValue(dna);
//            } else {
//                jobArray(i).setValue(fullString);
//            }
//            break;
//        }

    public String toString() {
        if(name == "") {
            name = "Data not available";
        }
        if(employer.getValue() == "") {
            employer.setValue("Data not available");
        }
        if(location.getValue() == "") {
            location.setValue("Data not available");
        }
        if(positionType.getValue() == "") {
            positionType.setValue("Data not available");
        }
        if(coreCompetency.getValue() == "") {
            coreCompetency.setValue("Data not available");
        }
        String output = "\nID: 1\n" +
            "Name: " + this.name + "\n" +
            "Employer: " + this.employer + "\n" +
            "Location: " + this.location + "\n" +
            "PositionType: " + this.positionType + "\n" +
            "CoreCompetency: " + this.coreCompetency + "\n";
        return output;
    }





}
