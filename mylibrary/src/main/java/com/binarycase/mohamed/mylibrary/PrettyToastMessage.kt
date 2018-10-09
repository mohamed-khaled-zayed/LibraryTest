package com.binarycase.mohamed.mylibrary

import android.content.Context
import android.widget.Toast

open class PrettyToastMessage {

    fun showSuccessToast(context : Context, text : String){
        Toast.makeText(context,text, Toast.LENGTH_LONG).show()
    }
}