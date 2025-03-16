/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author rgiacovazzi
 * Date: 14/03/2025
 * Description: The Patient class represents a patient in the BloodScheduler application. It contains the patient's name, priority, age, hospital status, priority score, GP name, and GP phone number.
 * The priority score is calculated based on the patient's priority, age, and hospital status.
 */
public class Patient {

    private String name;
    private String priority;
    private int age;
    private boolean hospital;
    private int priorityScore;
    private String gpName;
    private String gpPhone;

    public Patient(String name, String priority, int age, boolean hospital, String gpName, String gpPhone) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.hospital = hospital;
        this.gpName = gpName;
        this.gpPhone = gpPhone;
        this.priorityScore = calculatePriorityScore();
    }

    private int calculatePriorityScore() {
        int score = 0;

        // Priority points
        switch (priority.toLowerCase()) {
            case "urgent":
                score += 3;
                break;
            case "medium":
                score += 2;
                break;
            case "low":
                score += 1;
                break;
        }

        // Age points
        if (age > 65 || age < 8) {
            score += 3;
        } else {
            score += 1;
        }

        // Hospital points
        score += (hospital ? 3 : 1); // Ternary Operator

        return score;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public int getAge() {
        return age;
    }

    public boolean isHospital() {
        return hospital;
    }

    public int getPriorityScore() {
        return priorityScore;
    }

    public String getGpName() {
        return gpName;
    }

    public String getGpPhone() {
        return gpPhone;
    }

    @Override
    public String toString() {
        return "name='" + name + "', priority='" + priority + "', age=" + age
                + ", hospital=" + hospital + ", priorityScore=" + priorityScore
                + ", gpName='" + gpName + "', gpPhone='" + gpPhone;
    }
}
