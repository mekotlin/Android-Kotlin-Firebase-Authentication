package mekotlinapps.dnyaneshwar.`in`.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Dnyaneshwar Dalvi on 23/11/17.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnSignOut.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent_ = Intent(this@MainActivity, LoginActivity::class.java)
            intent_.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent_.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent_)
            finish()
        }
    }
}