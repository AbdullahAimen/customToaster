package com.pl.customtoaster

interface CustomToastInteractor {

    fun show(toastMSG:String, toastDuration:Int)
    fun show(toastMSG:Int, toastDuration:Int)
}