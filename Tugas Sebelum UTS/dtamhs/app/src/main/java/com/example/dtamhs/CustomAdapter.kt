package com.example.dtamhs
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val userList: ArrayList<mahasiswa>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mhs: mahasiswa=userList[position]
        holder?.textViewName?.text = mhs.nomor_mahasiswa
        holder?.textViewNim?.text = mhs.nama_mahasiswa
        holder?.textViewAlamat?.text = mhs.alamat_mahasiswa

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return  ViewHolder(v)

    }


    override fun getItemCount(): Int {

        return userList.size
    }



    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewNim = itemView.findViewById(R.id.textViewNim) as TextView
        val textViewAlamat = itemView.findViewById(R.id.textViewAlamat) as TextView




    }

}