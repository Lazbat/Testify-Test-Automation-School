package org.Tasks;

public abstract class Task17A {
    //You are required to build the blueprint for your company's login page.
    //From the discussions with the product team,
    //all login pages will have a username field, password field, forgot password field, and sign-in button
    //while other elements like remember me checkbox, continue to homePage, OAuth button will not be applicable to all login pages.
    //With your knowledge of Abstract classes, Create a class that others developers will have to inherit from.

    //All login pages will have the following fields:
    public abstract void userName();
    public abstract void password();
    public abstract void forgotPassword();
    public abstract void signInButton();

    //The below will not be applicable to all login pages
    public void rememberMeCheckBox(){
        System.out.println();
    }
    public void continueToHomePage(){
        System.out.println();
    }
    public void OAuthButton(){
        System.out.println();
    }

}
