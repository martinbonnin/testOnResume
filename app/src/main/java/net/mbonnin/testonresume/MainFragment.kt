package net.mbonnin.testonresume

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("TAG", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onResume() {
        Log.d("TAG", "onResume: width=" + view.width)
        super.onResume()
    }

    override fun onAttach(context: Context?) {
        Log.d("TAG", "onAttach")
        super.onAttach(context)
    }

}