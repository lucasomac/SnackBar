package br.com.lucolimac.snackbar

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            showSnack("Meu primeiro Snack")
        }
    }

    fun showSnack(msg: String) {
        var snack = Snackbar.make(layoutSnack, msg, Snackbar.LENGTH_LONG)
        snack.setAction("OK", View.OnClickListener {
            btn.setBackgroundColor(Color.green(1))
        })
        snack.show()
    }
}