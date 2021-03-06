package com.example.inspiringpersonsfragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inspiringpersonsfragments.adapters.InspiringPersonsAdapter
import com.example.inspiringpersonsfragments.data.InspiringPersonsRepository
import com.example.inspiringpersonsfragments.R
import com.example.inspiringpersonsfragments.databinding.FragmentInspiringPersonListBinding

class InspiringPersonsListFragment : Fragment() {

    private lateinit var personsListFragmentBinding : FragmentInspiringPersonListBinding
    private var adapter= InspiringPersonsAdapter()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        personsListFragmentBinding=FragmentInspiringPersonListBinding.inflate(inflater,container,false)
        setupRecycler()
        personsListFragmentBinding.btnNewInspiringPerson.setOnClickListener{}
        return personsListFragmentBinding.root
    }

    private fun setupRecycler(){
        personsListFragmentBinding.rvInspiringPersons.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        personsListFragmentBinding.rvInspiringPersons.adapter=adapter
        adapter.update(InspiringPersonsRepository.getInspiringPersons())
        personsListFragmentBinding.btnNewInspiringPerson.setOnClickListener{addNewPerson()}

    }
    companion object {
        const val TAG = "Inspiring persons list"
        fun create(): InspiringPersonsListFragment {
            return InspiringPersonsListFragment()
        }
    }

    private fun addNewPerson(){
        fragmentManager!!.beginTransaction().replace(
            R.id.fl_fragmentContainer,
            NewInspiringPersonFragment.create()
        ).addToBackStack(null).commit()
    }
}