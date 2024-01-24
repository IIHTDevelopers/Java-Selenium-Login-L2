package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
        money_control_element.put("login_link", "");
        money_control_element.put("login_signup_box", "");
        money_control_element.put("signup_box_login_link", "");
        money_control_element.put("login_signin_iframe", "");
        money_control_element.put("login_signin_box", "");
        money_control_element.put("signin_box_email_field", "");
        money_control_element.put("signin_box_password_field", "");
        money_control_element.put("signin_box_login_button", "");
        money_control_element.put("logged_in_user_link", "");
        money_control_element.put("signin_box_error_div", "");

        money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

        
        money_control_element.put("submit_button", "");
        money_control_element.put("reset_button", "");
       
    }
}
