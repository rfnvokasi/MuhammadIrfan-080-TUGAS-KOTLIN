package com.example.dtamhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_insert.*
import org.json.JSONArray

class insert : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert);
        var context = this

        update5.setOnClickListener {
            val data_nama: String = nama.text.toString()
            val data_nim: String = nim.text.toString()
            val data_almt: String = alamat.text.toString()

            postkeserver(data_nama, data_nim, data_almt)

            nama.setText("")
            nim.setText("")
            alamat.setText("")



        }

        btnbck5.setOnClickListener {
            intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun postkeserver(data_nama: String, data_nim: String, data_almt: String) {
        AndroidNetworking.post("http://192.168.100.18/API/tambah.php")
            .addBodyParameter("nama_mahasiswa", data_nama)
            .addBodyParameter("nomor_mahasiswa", data_nim)
            .addBodyParameter("alamat_mahasiswa", data_almt)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })
    }

}
