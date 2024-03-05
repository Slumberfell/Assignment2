/*
Tamar Foster
Assignment 2
02/28/2024
 */

package edu.quinnipiac.myapplication

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import edu.quinnipiac.myapplication.IGame.GameConstants

class MainActivity : AppCompatActivity(), IGame{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Establishes the backButton having the functionality to locate the user to other fragments
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val navController = findNavController(R.id.nav_host_fragment)
            navController.navigate(R.id.action_mainActivity_to_splashScreen)

        }
        }

    /*
    Checks for a winner whenever the game state changes. It does so by then checking what game
    constant is returned, and then applying the appropiate text to an otherwise empty TextView
     */
    override fun checkForWinner(): 'fun' {
        when(gameState){
        GameConstants.TIE -> {
            view?.findViewById<TextView>(R.id.EndText)?.text = "You've tied!"
        }

        GameConstants.RED -> {
            view?.findViewById<TextView>(R.id.EndText)?.text = "The AI has won!"
        }

        GameConstants.BLUE -> {
            view?.findViewById<TextView>(R.id.EndText)?.text = "$username has won!"
        }
        }
    }

    //Gets the computer move and then executes it.
    private fun getComputerMove(){
        var computerMove = FIRBoard.computerMove
        FIRBoard.setMove(GameConstants.RED, computerMove)
        FIRBoard.getChildAt(computerMove).setBackGroundColor(-0x00FF)
        var playerTurn = true
    }

    //Sets the player piece, which is set to blue. Would be assigned to GameConstants.BLUE upon clicking, alongside the visual change.
    override fun setMove(): `fun`? {
        val B00: Button = findViewById(R.id.B00)
        B00.setOnClickListener()
        {
            B00.setBackgroundColor(-0x00FF)
        }

        val B01: Button = findViewById(R.id.B01)
        B01.setOnClickListener()
        {
            B01.setBackgroundColor(-0x00FF)
        }
        val B02: Button = findViewById(R.id.B02)
        B02.setOnClickListener()
        {
            B02.setBackgroundColor(-0x00FF)
        }

        val B03: Button = findViewById(R.id.B03)
        B03.setOnClickListener()
        {
            B03.setBackgroundColor(-0x00FF)
        }

        val B04: Button = findViewById(R.id.B04)
        B04.setOnClickListener()
        {
            B04.setBackgroundColor(-0x00FF)
        }

        val B05: Button = findViewById(R.id.B05)
        B05.setOnClickListener()
        {
            B05.setBackgroundColor(-0x00FF)
        }
        val B10: Button = findViewById(R.id.B10)
        B10.setOnClickListener()
        {
            B10.setBackgroundColor(-0x00FF)
        }

        val B11: Button = findViewById(R.id.B11)
        B11.setOnClickListener()
        {
            B11.setBackgroundColor(-0x00FF)
        }
        val B12: Button = findViewById(R.id.B12)
        B12.setOnClickListener()
        {
            B12.setBackgroundColor(-0x00FF)
        }
        val B13: Button = findViewById(R.id.B13)
        B13.setOnClickListener()
        {
            B13.setBackgroundColor(-0x00FF)
        }
        val B14: Button = findViewById(R.id.B14)
        B14.setOnClickListener()
        {
            B14.setBackgroundColor(-0x00FF)
        }
        val B15: Button = findViewById(R.id.B15)
        B15.setOnClickListener()
        {
            B15.setBackgroundColor(-0x00FF)
        }
        val B20: Button = findViewById(R.id.B20)
        B20.setOnClickListener()
        {
            B20.setBackgroundColor(-0x00FF)
        }
        val B21: Button = findViewById(R.id.B21)
        B21.setOnClickListener()
        {
            B21.setBackgroundColor(-0x00FF)
        }
        val B22: Button = findViewById(R.id.B22)
        B22.setOnClickListener()
        {
            B22.setBackgroundColor(-0x00FF)
        }
        val B23: Button = findViewById(R.id.B23)
        B23.setOnClickListener()
        {
            B23.setBackgroundColor(-0x00FF)
        }
        val B24: Button = findViewById(R.id.B24)
        B24.setOnClickListener()
        {
            B24.setBackgroundColor(-0x00FF)
        }
        val B25: Button = findViewById(R.id.B25)
        B25.setOnClickListener()
        {
            B25.setBackgroundColor(-0x00FF)
        }
        val B30: Button = findViewById(R.id.B30)
        B30.setOnClickListener()
        {
            B30.setBackgroundColor(-0x00FF)
        }
        val B31: Button = findViewById(R.id.B31)
        B31.setOnClickListener()
        {
            B31.setBackgroundColor(-0x00FF)
        }
        val B32: Button = findViewById(R.id.B32)
        B32.setOnClickListener()
        {
            B32.setBackgroundColor(-0x00FF)
        }
        val B33: Button = findViewById(R.id.B33)
        B33.setOnClickListener()
        {
            B33.setBackgroundColor(-0x00FF)
        }
        val B34: Button = findViewById(R.id.B34)
        B34.setOnClickListener()
        {
            B34.setBackgroundColor(-0x00FF)
        }
        val B35: Button = findViewById(R.id.B35)
        B35.setOnClickListener()
        {
            B35.setBackgroundColor(-0x00FF)
        }
        val B40: Button = findViewById(R.id.B40)
        B40.setOnClickListener()
        {
            B40.setBackgroundColor(-0x00FF)
        }
        val B41: Button = findViewById(R.id.B41)
        B41.setOnClickListener()
        {
            B41.setBackgroundColor(-0x00FF)
        }
        val B42: Button = findViewById(R.id.B42)
        B42.setOnClickListener()
        {
            B42.setBackgroundColor(-0x00FF)
        }
        val B43: Button = findViewById(R.id.B43)
        B43.setOnClickListener()
        {
            B43.setBackgroundColor(-0x00FF)
        }
        val B44: Button = findViewById(R.id.B44)
        B44.setOnClickListener()
        {
            B44.setBackgroundColor(-0x00FF)
        }
        val B45: Button = findViewById(R.id.B45)
        B45.setOnClickListener()
        {
            B45.setBackgroundColor(-0x00FF)
        }
        val B50: Button = findViewById(R.id.B50)
        B50.setOnClickListener()
        {
            B50.setBackgroundColor(-0x00FF)
        }
        val B51: Button = findViewById(R.id.B51)
        B51.setOnClickListener()
        {
            B51.setBackgroundColor(-0x00FF)
        }
        val B52: Button = findViewById(R.id.B52)
        B52.setOnClickListener()
        {
            B52.setBackgroundColor(-0x00FF)
        }
        val B53: Button = findViewById(R.id.B53)
        B53.setOnClickListener()
        {
            B53.setBackgroundColor(-0x00FF)
        }
        val B54: Button = findViewById(R.id.B54)
        B54.setOnClickListener()
        {
            B54.setBackgroundColor(-0x00FF)
        }
        val B55: Button = findViewById(R.id.B55)
        B55.setOnClickListener()
        {
            B55.setBackgroundColor(-0x00FF)
        }
    }

    //Sets all visuals of the button from red or blue back to. Would also remove the assignment of any game constants
    override fun clearBoard(): 'fun' {
        val resetButton: Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener()
        {
            val B00: Button = findViewById(R.id.B00)
            val B01: Button = findViewById(R.id.B01)
            val B02: Button = findViewById(R.id.B02)
            val B03: Button = findViewById(R.id.B03)
            val B04: Button = findViewById(R.id.B04)
            val B05: Button = findViewById(R.id.B05)
            val B10: Button = findViewById(R.id.B10)
            val B11: Button = findViewById(R.id.B11)
            val B12: Button = findViewById(R.id.B12)
            val B13: Button = findViewById(R.id.B13)
            val B14: Button = findViewById(R.id.B14)
            val B15: Button = findViewById(R.id.B15)
            val B20: Button = findViewById(R.id.B20)
            val B21: Button = findViewById(R.id.B21)
            val B22: Button = findViewById(R.id.B22)
            val B23: Button = findViewById(R.id.B23)
            val B24: Button = findViewById(R.id.B24)
            val B25: Button = findViewById(R.id.B25)
            val B30: Button = findViewById(R.id.B30)
            val B31: Button = findViewById(R.id.B31)
            val B32: Button = findViewById(R.id.B32)
            val B33: Button = findViewById(R.id.B33)
            val B34: Button = findViewById(R.id.B34)
            val B35: Button = findViewById(R.id.B35)
            val B40: Button = findViewById(R.id.B40)
            val B41: Button = findViewById(R.id.B41)
            val B42: Button = findViewById(R.id.B42)
            val B43: Button = findViewById(R.id.B43)
            val B44: Button = findViewById(R.id.B44)
            val B45: Button = findViewById(R.id.B45)
            val B50: Button = findViewById(R.id.B50)
            val B51: Button = findViewById(R.id.B51)
            val B52: Button = findViewById(R.id.B52)
            val B53: Button = findViewById(R.id.B53)
            val B54: Button = findViewById(R.id.B54)
            val B55: Button = findViewById(R.id.B55)

            B00.setBackgroundColor(-0xFFFF)
            B01.setBackgroundColor(-0xFFFF)
            B02.setBackgroundColor(-0xFFFF)
            B03.setBackgroundColor(-0xFFFF)
            B04.setBackgroundColor(-0xFFFF)
            B05.setBackgroundColor(-0xFFFF)
            B10.setBackgroundColor(-0xFFFF)
            B11.setBackgroundColor(-0xFFFF)
            B12.setBackgroundColor(-0xFFFF)
            B13.setBackgroundColor(-0xFFFF)
            B14.setBackgroundColor(-0xFFFF)
            B15.setBackgroundColor(-0xFFFF)
            B20.setBackgroundColor(-0xFFFF)
            B21.setBackgroundColor(-0xFFFF)
            B22.setBackgroundColor(-0xFFFF)
            B23.setBackgroundColor(-0xFFFF)
            B24.setBackgroundColor(-0xFFFF)
            B25.setBackgroundColor(-0xFFFF)
            B30.setBackgroundColor(-0xFFFF)
            B31.setBackgroundColor(-0xFFFF)
            B32.setBackgroundColor(-0xFFFF)
            B33.setBackgroundColor(-0xFFFF)
            B34.setBackgroundColor(-0xFFFF)
            B35.setBackgroundColor(-0xFFFF)
            B40.setBackgroundColor(-0xFFFF)
            B41.setBackgroundColor(-0xFFFF)
            B42.setBackgroundColor(-0xFFFF)
            B43.setBackgroundColor(-0xFFFF)
            B44.setBackgroundColor(-0xFFFF)
            B45.setBackgroundColor(-0xFFFF)
            B50.setBackgroundColor(-0xFFFF)
            B51.setBackgroundColor(-0xFFFF)
            B52.setBackgroundColor(-0xFFFF)
            B53.setBackgroundColor(-0xFFFF)
            B54.setBackgroundColor(-0xFFFF)
            B55.setBackgroundColor(-0xFFFF)
        }
    }
}