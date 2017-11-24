# README #

[Add Firebase to your Android project.](https://firebase.google.com/docs/android/setup)

Add the dependency for Firebase Authentication to your app-level build.gradle file:

compile 'com.google.firebase:firebase-auth:11.6.0'

If you haven't yet connected your app to your Firebase project, do so from the Firebase console.

If you haven't already set your app's SHA-1 hash in the Firebase console, do so. See Authenticating Your Client for information about finding your app's SHA-1 hash.

Enable Phone Number sign-in for your Firebase project

To sign in users by SMS, you must first enable the Phone Number sign-in method for your Firebase project:

In the Firebase console, open the Authentication section.

On the Sign-in Method page, enable the Phone Number sign-in method.

Firebase's phone number sign-in request quota is high enough that most apps won't be affected. However, if you need to sign in a very high volume of users with phone authentication, you might need to upgrade your pricing plan. See the pricing page.
