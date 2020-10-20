package com.example.android.just_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String priceMessage;
        if (numberOfCoffees > 0) {
            priceMessage = "The order is accepted.\nThanks!";
            numberOfCoffees = 0;
        } else {
            priceMessage = "Сhoose the number of cups!";
        }
        displayMessage(priceMessage);
    }

    public void increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * price);
        TextView priceTextView = (TextView) findViewById(R.id.thanks_text_view);
        priceTextView.setText("");
    }

    public void decrement(View view) {
        if (numberOfCoffees > 0) {
            numberOfCoffees--;
        }
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * price);
        TextView priceTextView = (TextView) findViewById(R.id.thanks_text_view);
        priceTextView.setText("");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.thanks_text_view);
        priceTextView.setText(message);
    }

}