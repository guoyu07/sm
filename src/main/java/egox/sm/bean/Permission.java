package egox.sm.bean;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.id
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.name
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.permission
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    private String permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.description
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.is_shown
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    private Boolean isShown;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.id
     *
     * @return the value of sys_permission.id
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.id
     *
     * @param id the value for sys_permission.id
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.name
     *
     * @return the value of sys_permission.name
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.name
     *
     * @param name the value for sys_permission.name
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.permission
     *
     * @return the value of sys_permission.permission
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.permission
     *
     * @param permission the value for sys_permission.permission
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.description
     *
     * @return the value of sys_permission.description
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.description
     *
     * @param description the value for sys_permission.description
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.is_shown
     *
     * @return the value of sys_permission.is_shown
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public Boolean getIsShown() {
        return isShown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.is_shown
     *
     * @param isShown the value for sys_permission.is_shown
     *
     * @mbggenerated Thu Dec 05 16:22:51 CST 2013
     */
    public void setIsShown(Boolean isShown) {
        this.isShown = isShown;
    }
}