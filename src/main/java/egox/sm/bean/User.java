package egox.sm.bean;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.date_created
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.date_modified
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private Date dateModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.screen_name
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    private String screenName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.date_created
     *
     * @return the value of t_user.date_created
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.date_created
     *
     * @param dateCreated the value for t_user.date_created
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.date_modified
     *
     * @return the value of t_user.date_modified
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.date_modified
     *
     * @param dateModified the value for t_user.date_modified
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.screen_name
     *
     * @return the value of t_user.screen_name
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.screen_name
     *
     * @param screenName the value for t_user.screen_name
     *
     * @mbggenerated Wed Nov 13 12:50:11 CST 2013
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName == null ? null : screenName.trim();
    }
}