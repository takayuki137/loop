package com.example.if_and_else

import android.media.MediaPlayer
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var mp: MediaPlayer
    private var totalTime : Int=0
    private lateinit var dragonquest: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this,R.raw.punch)
        mp.setVolume(0.7f,0.7f)
        totalTime = mp.duration
        println("")



        dragonquest = MediaPlayer.create( this, R.raw.quest)
        dragonquest.setVolume(0.5f,0.5f)
        dragonquest.isLooping=true
        dragonquest.start()
    }

    fun bgm(view: View) {

        if (mp.isPlaying) {
            //Stop
            mp.pause()
            print("hope")

            //クリックされたらストップされる
        } else {

            mp.start()

        }

        var flag = false

        button.setOnClickListener {

            if (flag){

                textView.setText(getString(R.string.hello))
                flag=false
            } else {

                textView.setText(getText(R.string.bye))
                flag = true
            }

        }


    }


}

