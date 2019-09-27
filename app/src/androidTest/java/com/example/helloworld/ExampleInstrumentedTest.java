package com.example.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;






import com.example.helloworld.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.helloworld", appContext.getPackageName());
    }
    public void addition_is_correct() throws Exception
    {
        assertEquals(4,2+2);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        editTsxt = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener   (new View.OnClickListener() {
            @Override
            public void onClick(View v)    {
                 assertEquals(editText.getText(),1,"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assertEquals(editText.getText(),1,"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTsxt == null) {
                    editTsxt.setText("");
                } else {
                    mValueOne = Float.parseFloat(editTsxt.getText() + "");
                    addition = true;
                    editTsxt.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTsxt.getText() + "");
                mSubtract = true;
                editTsxt.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTsxt.getText() + "");
                multiplication = true;
                editTsxt.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTsxt.getText() + "");
                division = true;
                editTsxt.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editTsxt.getText() + "");

                if (addition == true) {
                    editTsxt.setText(mValueOne +" + "+mValueTwo+" = "+mValueOne + mValueTwo + "");
                    addition = false;
                }

                if (mSubtract == true) {
                    editTsxt.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (multiplication == true) {
                    editTsxt.setText(mValueOne +" * "+mValueTwo+" = "+mValueOne * mValueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    editTsxt.setText(mValueOne +" / "+mValueTwo+" = "+mValueOne / mValueTwo + "");
                    division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + ".");
            }
        });
    }



}
