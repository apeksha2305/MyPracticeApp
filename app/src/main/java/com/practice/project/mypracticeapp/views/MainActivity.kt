package com.practice.project.mypracticeapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.practice.project.mypracticeapp.R
import com.practice.project.mypracticeapp.adapter.NamesRecyclerViewAdapter
import com.practice.project.mypracticeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.rvNames.adapter = NamesRecyclerViewAdapter(getNames())
    }

    fun getNames() : List<String> {
        var names = ArrayList<String>()
        names.add("apeksha gunjal")
        names.add("shiv yadav")
        names.add("sagar bhalekar")
        names.add("vishal jadhavl")
        names.add("shweta dalavi")
        names.add("pravin diti")
        names.add("shiva tumma")
        names.add("surya singh")
        names.add("apeksha gunjal")
        names.add("shiv yadav")
        names.add("sagar bhalekar")
        names.add("vishal jadhavl")
        names.add("shweta dalavi")
        names.add("pravin diti")
        names.add("shiva tumma")
        names.add("surya singh")

        return names
    }

    sealed class ABC{
        fun read() {

        }
        data class A (var k : Int)
    }
}