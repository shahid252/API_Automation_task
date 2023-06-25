package models;

public class ActivityDetails {
    private int id;
    private String title;
    private String dueDate;
    private boolean completed;

    /**
     * Default constructor for the ActivityDetails class.
     */
    public ActivityDetails() {
    }

    /**
     * Gets the ID of the activity.
     *
     * @return The ID of the activity.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of the activity.
     *
     * @return The title of the activity.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the due date of the activity.
     *
     * @return The due date of the activity.
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Checks if the activity is completed.
     *
     * @return true if the activity is completed, false otherwise.
     */
    public boolean isCompleted() {
        return completed;
    }
}
