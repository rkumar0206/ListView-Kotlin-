package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: ArrayList<Custom_list> = ArrayList()
        list.add(Custom_list(R.drawable.ic_android_black_24dp, "Android"))
        list.add(Custom_list(R.drawable.ic_announcement_black_24dp, "Announcement"))
        list.add(Custom_list(R.drawable.ic_archive_black_24dp, "Archive"))
        list.add(Custom_list(R.drawable.ic_beach_access_black_24dp, "Umbrella"))
        list.add(Custom_list(R.drawable.ic_brightness_2_black_24dp, "Brightness"))
        list.add(Custom_list(R.drawable.ic_call_end_black_24dp, "Call end"))
        list.add(Custom_list(R.drawable.ic_camera_black_24dp, "Camera"))
        list.add(Custom_list(R.drawable.ic_fingerprint_black_24dp, "FingerPrint"))

        list.add(Custom_list(R.drawable.ic_android_black_24dp, "Android"))
        list.add(Custom_list(R.drawable.ic_announcement_black_24dp, "Announcement"))
        list.add(Custom_list(R.drawable.ic_archive_black_24dp, "Archive"))
        list.add(Custom_list(R.drawable.ic_beach_access_black_24dp, "Umbrella"))
        list.add(Custom_list(R.drawable.ic_brightness_2_black_24dp, "Brightness"))
        list.add(Custom_list(R.drawable.ic_call_end_black_24dp, "Call end"))
        list.add(Custom_list(R.drawable.ic_camera_black_24dp, "Camera"))
        list.add(Custom_list(R.drawable.ic_fingerprint_black_24dp, "FingerPrint"))

        adapter = CustomAdapter(this, list)

        listview.adapter = adapter

        listview.onItemClickListener = this

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        Toast.makeText(this,"$position",Toast.LENGTH_LONG).show()


    }
}
