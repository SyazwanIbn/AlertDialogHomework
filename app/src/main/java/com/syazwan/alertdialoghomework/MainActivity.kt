package com.syazwan.alertdialoghomework

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun save(view: View) {

        val saveAlert = Builder(this)
        saveAlert.setTitle("Save")
        saveAlert.setMessage("Are you sure want to change your changes")
        saveAlert.setPositiveButton("Yes"){
            dialogInterface: DialogInterface, _: Int -> Snackbar.make(
                findViewById(R.id.button),
                "Saved", Snackbar.LENGTH_LONG)
            .show(            )
        }

        saveAlert.setNegativeButton("No"){
            dialogInterface: DialogInterface,_: Int -> Snackbar.make(
                findViewById(R.id.button),
                "Not Saved",Snackbar.LENGTH_LONG).show()

        }
        saveAlert.setNeutralButton("Remind Me Later",null)
        saveAlert.show()
    }
}