package com.example.android.listview1512

import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val values = resources.getStringArray(R.array.permission)



        lview.setOnItemClickListener { parent, view, pos, id ->
            val status1 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.CAMERA)
            if (status1 == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            } else {
                /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_SHORT).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.CAMERA), 11)
            }//camera

            val status2 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.BLUETOOTH)
            if (status2 == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            }
            else
            {
                /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_LONG).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.BLUETOOTH), 12)

            }//bluetooth
            val status3 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.READ_SMS)
            if (status3 == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            }
            else
            {
                /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_LONG).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_SMS), 13)

            }//sms
            val status4 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.READ_CONTACTS)
            if (status4 == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            }
            else
            {
                /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_LONG).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_CONTACTS), 14)

            }//contacts
            val status5 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.READ_PHONE_STATE)
            if (status5 == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            }
            else
            {
                /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_LONG).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_PHONE_STATE), 15)

            }//phone
            val status6 = ContextCompat.checkSelfPermission(this@MainActivity, android.Manifest.permission.READ_EXTERNAL_STORAGE)
            if (status6 == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this@MainActivity, values[pos], Toast.LENGTH_LONG).show()
            }
            else
            {
             /*   val values1 = resources.getString(R.string.DeniedPermission)
                Toast.makeText(this@MainActivity, values1, Toast.LENGTH_LONG).show()*/
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE), 16)

            }//storage
        }//onclick()
    }//onCreate()

    }

































