package com.example.meta

import android.content.ContentValues
import android.util.Log
import com.google.firebase.auth.FirebaseAuth


fun regViaEmail(
    email: String,
    password: String
){
    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
        .addOnSuccessListener {
            Log.d(ContentValues.TAG, "Successfully registered a user")
        }

}

fun firebase(){
  val user =  FirebaseAuth.getInstance().currentUser?.uid
}
