package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textViewWynik;
EditText editTextSlowo1;
EditText editTextSlowo2;
Button buttonPalindrom;
Button buttonAnagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewWynik=findViewById(R.id.textView3);
        editTextSlowo1=findViewById(R.id.editTextTextPersonName);
        editTextSlowo2=findViewById(R.id.editTextTextPersonName2);
        buttonPalindrom=findViewById(R.id.button);
        buttonAnagram=findViewById(R.id.button2);

        buttonPalindrom.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String slowo=editTextSlowo1.getText().toString();
                        if(czyPalindrom(slowo)){
                            textViewWynik.setText("Slowo jest palindromem");
                        }else{
                            textViewWynik.setText("Slowo nie jest palindromem");
                        }
                    }
                }
        );
        buttonAnagram.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String slowo=editTextSlowo2.getText().toString();
                        Toast.makeText(MainActivity.this, slowo, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    private boolean czyPalindrom(String slowo){
        String odwroconeSlowo="";
        for(int i=slowo.length()-1;i>=0;i--){
            odwroconeSlowo=odwroconeSlowo+slowo.charAt(i);
        }
        if(slowo.equals(odwroconeSlowo)){
            return true;
        }else{
            return false;
        }

    }

    /**
     * Nazwa czyPalindrom2
     * Opis-Metoda sprawdza czy slowo bedace parametrem metody jest palindromem
     * Parametry
     * slowo-Zmienia typy string dla, ktroej bedzie sprawdzane czy slowo jest palindromem
     * Zwracana wartosc-zwaraca wartosc logiczna true jesli slowo jest palindromem ifalse jesli nie jest
     */
    private boolean czyPalindrom2(String slowo){
        int k=slowo.length();
        for(int i=0;i<(slowo.length()/2);i++){
            k--;
            if(slowo.charAt(i)==slowo.charAt(k)){
             continue;
            }else{
                return false;
            }

        }
        return true;
    }
}