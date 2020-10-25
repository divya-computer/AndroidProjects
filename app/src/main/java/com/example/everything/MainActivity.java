package com.example.everything;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import EachSingle.*;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    String mTitle[] = {"Button", "Radiobutton", "checkbox", "Ratingbar", "seekbar", "Switch", "tooglebar", "autocomplete Text", "Spinner", "MultiAutoComplete Text", "Checkedtextview", "TextSwitcher", "ImagesSwitch", "AdapterviewFlipper", "ImageButton", "ImageView", "Videoview", "TextClock", "DatePicker", "TimePicker", "Chronometer", "Email", "Maps", "Phone call", "Phone Dial", "Camera", "Activity Transition", "Passing value from one Activity to Another Activity", "StartActivityFor Result", "Facebook", "Instagram", "Twitter", "Whatsapp", "Googleplus", "Simple Toast", "Positioning Toast Message", "Custom Toast", "ListView", "Custom ListView",  "Expandable ListView", "GridView", "WebView", "SearchView", "Context Menu", "Option Menu", "PopUp Menu", "Activity LifeCycle", "Fragment Lifecycle", "Fragment and Activity Lifecycle Combined", "InterFragment Communication", "List Fragment", "Dialog Fragment" , "Service Lifecycle" , "Service Example" , "Phone Details" , "Read Contacts" , "Change Wifi State" , "Get Wifi Info" , "Get Wifi List" , "Fade" , "Zoom" , "Rotate" , "Move" , "Slide" , "Bounce" , "Blink" , "Sequential" , "Together" , "SharedPreference" , "Internal Storage" , "External Storage" , "Cache Storage" , "Notification" , "WaveLoading" , "Disable Button" , "FontStyle" , "TextInput EditText" , "Floating ActionButton" , "SnackBars" , "Bottom Navigation" , "Bottom Sheets" , "Navigation Drawer" , "Bluetooth" , "Torch", "Tic Tac Toe" , "Calculator" , "Wallpaper Button" , "TextToToast" , "RandomNumberGenerator" , "RandomColorGenerator" , "ColorSeekBar" , "Color Picker" , "Scratch View" , "Brightness Bitmap" , "Background Seekbar" , "Shared Elements transition" , "Styleable Toast" , "Vibrate by Click" , "Soundpool" , "Spin the Bottle" , "ImageSlider" , "Countdown Timer" , "Lotties Animations"  , "Preloaders"};
    int images[] = {R.drawable.button, R.drawable.radiobutton, R.drawable.checkbox, R.drawable.rating, R.drawable.seekbar, R.drawable.swicon, R.drawable.tooglebutton, R.drawable.autotexticon, R.drawable.spinner, R.drawable.multiautoicon, R.drawable.checkedtexticon, R.drawable.textswitchericon, R.drawable.imageswitcher, R.drawable.adapterviewflipper, R.drawable.buttonimage, R.drawable.multiautoicon, R.drawable.videoviewicon, R.drawable.textclock, R.drawable.datepicker, R.drawable.timepicker, R.drawable.chronometer, R.drawable.email, R.drawable.maps, R.drawable.phonecall, R.drawable.phonedial, R.drawable.camera, R.drawable.activitytransition, R.drawable.passingvaluefromonetotwo, R.drawable.startactivityfromresult, R.drawable.facebook, R.drawable.instagram, R.drawable.twitter, R.drawable.whatsapp, R.drawable.googleplus, R.drawable.simpletoast, R.drawable.positioningtoastmessage, R.drawable.customtoast, R.drawable.listview, R.drawable.customlistview, R.drawable.expandablelistview, R.drawable.gridview, R.drawable.webview, R.drawable.searchview, R.drawable.context, R.drawable.optionview, R.drawable.popup, R.drawable.activitylifecycle, R.drawable.fragmentlifecycle, R.drawable.fragmentandactivitylifecyclecombined, R.drawable.interfragmentcommunicationn, R.drawable.listfragment, R.drawable.dialogfragment,R.drawable.servicelifecycle , R.drawable.serviceexample , R.drawable.phonedetail , R.drawable.readcontacts , R.drawable.changewifistate , R.drawable.getwifiinfo , R.drawable.getwifilist , R.drawable.fade , R.drawable.zoom , R.drawable.rotate , R.drawable.move , R.drawable.slide , R.drawable.bounce , R.drawable.blink , R.drawable.sequential , R.drawable.together , R.drawable.sharedpreference , R.drawable.internalstorage , R.drawable.externalstorage , R.drawable.cache , R.drawable.notifaction , R.drawable.waveloading , R.drawable.disablebutton , R.drawable.textstyle , R.drawable.textinputedittext , R.drawable.floatingactionbar , R.drawable.snackbars , R.drawable.bottomnavigation , R.drawable.bottomsheets , R.drawable.navigationdrawer , R.drawable.bluetooth , R.drawable.torch , R.drawable.tictactoe , R.drawable.calculator , R.drawable.wallpapericon , R.drawable.texttotoast , R.drawable.randomgeneratenumber , R.drawable.colorgenerator , R.drawable.colorseekbar , R.drawable.colorpick , R.drawable.scratchactivity , R.drawable.brightnessbitmap , R.drawable.seekbarbackground , R.drawable.sharedelement , R.drawable.customtoast , R.drawable.vibrate , R.drawable.soundpool , R.drawable.spinbottle , R.drawable.imageslider , R.drawable.countdowntimer , R.drawable.lotties , R.drawable.preloader};




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this,mTitle,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position == 0)
                {
                    Toast.makeText(MainActivity.this, "Button Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i0 = new Intent(MainActivity.this, ButtonActivity.class);
                    startActivity(i0);
                }
                if (position == 1)
                {
                    Toast.makeText(MainActivity.this, "RadioButton Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i1 = new Intent(MainActivity.this, RadioButtonActivity.class);
                    startActivity(i1);
                }
                if (position == 2)
                {
                    Toast.makeText(MainActivity.this, "Checkbox Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i2 = new Intent(MainActivity.this, CheckBoxActivity.class);
                   startActivity(i2);
                }
                if (position == 3)
                {
                    Toast.makeText(MainActivity.this, "RatingBar Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i3 = new Intent(MainActivity.this, RatingBarActivity.class);
                    startActivity(i3);
                }
                if (position == 4)
                {
                    Toast.makeText(MainActivity.this, "Seekbar Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i4 = new Intent(MainActivity.this, SeekBarActivity.class);
                    startActivity(i4);
                }
                if (position == 5)
                {
                    Toast.makeText(MainActivity.this, "Switch Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i5 = new Intent(MainActivity.this, SwitchActivity.class);
                    startActivity(i5);
                }
                if (position == 6)
                {
                    Toast.makeText(MainActivity.this, "ToogleBar Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i6 = new Intent(MainActivity.this, ToogleBarActivity.class);
                    startActivity(i6);
                }
                if (position == 7)
                {
                    Toast.makeText(MainActivity.this, "AutoComplete Text Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i7 = new Intent(MainActivity.this, AutoCompleteTextViewActivity.class);
                    startActivity(i7);
                }
                if (position == 8)
                {
                    Toast.makeText(MainActivity.this, "Spinner Text Clicked...", Toast.LENGTH_SHORT).show();

                    Intent i8 = new Intent(MainActivity.this, SpinnerActivity.class);
                    startActivity(i8);
                }
                if (position == 9)
                {
                    Toast.makeText(MainActivity.this, "MultiAutoComplete Text Clicked...", Toast.LENGTH_SHORT).show();

                    Intent i9 = new Intent(MainActivity.this, MultiAutoCompleteTextViewActivity.class);
                    startActivity(i9);
                }
                if (position == 10)
                {
                    Toast.makeText(MainActivity.this, "CheckedTextView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i10 = new Intent(MainActivity.this, CheckedTextViewActivity.class);
                    startActivity(i10);
                }
                if (position == 11)
                {
                    Toast.makeText(MainActivity.this, "TextSwitcher Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i11 = new Intent(MainActivity.this, TextSwitcherActivity.class);
                    startActivity(i11);
                }
                if (position == 12)
                {
                    Toast.makeText(MainActivity.this, "ImagesSwitcher Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i12 = new Intent(MainActivity.this, ImagesSwitcherActivity.class);
                    startActivity(i12);
                }
                if (position == 13)
                {
                    Toast.makeText(MainActivity.this, "AdapterViewFlipper Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i13 = new Intent(MainActivity.this, AdapterViewFlipperActivity.class);
                    startActivity(i13);
                }
                if (position == 14)
                {
                    Toast.makeText(MainActivity.this, "ImagesButton Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i14 = new Intent(MainActivity.this, ImageButtonActivity.class);
                    startActivity(i14);
                }
                if (position == 15)
                {
                    Toast.makeText(MainActivity.this, "ImageView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i15 = new Intent(MainActivity.this, ImageViewActivity.class);
                    startActivity(i15);
                }
                if (position == 16)
                {
                    Toast.makeText(MainActivity.this, "VideoView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i16 = new Intent(MainActivity.this, VideoViewActivity.class);
                    startActivity(i16);
                }
                if (position == 17)
                {
                    Toast.makeText(MainActivity.this, "TextClock Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i17 = new Intent(MainActivity.this, TextClockActivity.class);
                    startActivity(i17);
                }
                if (position == 18)
                {
                    Toast.makeText(MainActivity.this, "DatePicker Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i18 = new Intent(MainActivity.this, DatePickerActivity.class);
                    startActivity(i18);
                }
                if (position == 19)
                {
                    Toast.makeText(MainActivity.this, "Timepicker Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i19 = new Intent(MainActivity.this, TimePickerActivity.class);
                    startActivity(i19);
                }
                if (position == 20)
                {
                    Toast.makeText(MainActivity.this, "Chronometer Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i20 = new Intent(MainActivity.this, ChronometerActivity.class);
                    startActivity(i20);
                }
                if (position == 21)
                {
                    Toast.makeText(MainActivity.this, "Email Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i21 = new Intent(MainActivity.this, EmailActivity.class);
                    startActivity(i21);
                }
                if (position == 22)
                {
                    Toast.makeText(MainActivity.this, "Maps Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i22 = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(i22);
                }
                if (position == 23)
                {
                    Toast.makeText(MainActivity.this, "Phone Call Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i23 = new Intent(MainActivity.this, PhoneCallActivity.class);
                    startActivity(i23);
                }
                if (position == 24)
                {
                    Toast.makeText(MainActivity.this, "Phone Dial Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i24 = new Intent(MainActivity.this, PhoneDialActivity.class);
                    startActivity(i24);
                }
                if (position == 25)
                {
                    Toast.makeText(MainActivity.this, "Camera Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i25 = new Intent(MainActivity.this, CameraActivity.class);
                    startActivity(i25);
                }
                if (position == 26)
                {
                    Toast.makeText(MainActivity.this, "Activity Transition Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i26 = new Intent(MainActivity.this, ActivityTransition1.class);
                    startActivity(i26);
                }
                if (position == 27)
                {
                    Toast.makeText(MainActivity.this, "Passing value from one Activity to Another Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i27 = new Intent(MainActivity.this, Passingvalueonetoanother1.class);
                    startActivity(i27);
                }
                if (position == 28)
                {
                    Toast.makeText(MainActivity.this, "StartActivityforResult Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i28 = new Intent(MainActivity.this, StartActivityforResult1.class);
                    startActivity(i28);
                }
                if (position == 29)
                {
                    Toast.makeText(MainActivity.this, "Facebook Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i29 = new Intent(MainActivity.this, FacebookActivity.class);
                    startActivity(i29);
                }
                if (position == 30)
                {
                    Toast.makeText(MainActivity.this, "Instagram Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i30 = new Intent(MainActivity.this, InstagramActivity.class);
                    startActivity(i30);
                }
                if (position == 31)
                {
                    Toast.makeText(MainActivity.this, "Twitter Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i31 = new Intent(MainActivity.this, TwitterActivity.class);
                    startActivity(i31);
                }
                if (position == 32)
                {
                    Toast.makeText(MainActivity.this, "Whatsapp Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i32 = new Intent(MainActivity.this, WhatsappActivity.class);
                    startActivity(i32);
                }
                if (position == 33)
                {
                    Toast.makeText(MainActivity.this, "GooglePlus Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i33 = new Intent(MainActivity.this, GooglePlusActivity.class);
                    startActivity(i33);
                }
                if (position == 34)
                {
                    Toast.makeText(MainActivity.this, "Simple Toast Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i34 = new Intent(MainActivity.this, SimpleToastActivity.class);
                    startActivity(i34);
                }
                if (position == 35)
                {
                    Toast.makeText(MainActivity.this, "Positioning Toast Message Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i35 = new Intent(MainActivity.this, positiontoastActivity.class);
                    startActivity(i35);
                }
                if (position == 36)
                {
                    Toast.makeText(MainActivity.this, "Custom Toast Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i36 = new Intent(MainActivity.this, CustomToastActivity1.class);
                    startActivity(i36);
                }
                if (position == 37)
                {
                    Toast.makeText(MainActivity.this, "ListView Clicked....", Toast.LENGTH_SHORT).show();
                    Intent i37 = new Intent(MainActivity.this, ListViewActivity.class);
                    startActivity(i37);
                }
                if (position == 38)
                {
                    Toast.makeText(MainActivity.this, "CustomListView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i38 = new Intent(MainActivity.this, CustomlistViewActivity.class);
                    startActivity(i38);
                }
                if (position == 39)
                {
                    Toast.makeText(MainActivity.this, "Expandable ListView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i39 = new Intent(MainActivity.this, ExpandableListViewActivity.class);
                    startActivity(i39);
                }
                if (position == 40)
                {
                    Toast.makeText(MainActivity.this, "Gridview Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i40 = new Intent(MainActivity.this, GridViewActivity.class);
                    startActivity(i40);
                }
                if (position == 41)
                {
                    Toast.makeText(MainActivity.this, "Webview Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i41 = new Intent(MainActivity.this, WebviewActivity.class);
                    startActivity(i41);
                }
                if (position == 42)
                {
                    Toast.makeText(MainActivity.this, "SearchView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i42 = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(i42);
                }
                if (position == 43)
                {
                    Toast.makeText(MainActivity.this, "ContextMenu Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i43 = new Intent(MainActivity.this, ContextMenuActivity.class);
                    startActivity(i43);
                }
                if (position == 44)
                {
                    Toast.makeText(MainActivity.this, "OptionMenu Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i44 = new Intent(MainActivity.this, OptionMenuActivity.class);
                    startActivity(i44);
                }
                if (position == 45)
                {
                    Toast.makeText(MainActivity.this, "PopUp Menu Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i45 = new Intent(MainActivity.this, PopupMenuActivity.class);
                    startActivity(i45);
                }
                if (position == 46)
                {
                    Toast.makeText(MainActivity.this, "ActivityLifeCycle Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i46 = new Intent(MainActivity.this, ActivityLifeCycleActivity.class);
                    startActivity(i46);
                }
                if (position == 47)
                {
                    Toast.makeText(MainActivity.this, "FragmentLifeCycle Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i47 = new Intent(MainActivity.this, ButtonActivity.class);
                    startActivity(i47);
                }
                if (position == 48)
                {
                    Toast.makeText(MainActivity.this, "FragmentandActivityLifecycleCombined Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i48 = new Intent(MainActivity.this, CombinedActivity1.class);
                    startActivity(i48);
                }
                if (position == 49)
                {
                    Toast.makeText(MainActivity.this, "InterFragment Commmunication Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i49 = new Intent(MainActivity.this, InterFragmentCommunication.class);
                    startActivity(i49);
                }
                if (position == 50)
                {
                    Toast.makeText(MainActivity.this, "List Fragment Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i50 = new Intent(MainActivity.this, ListFragmentActivity.class);
                    startActivity(i50);
                }
                if (position == 51)
                {
                    Toast.makeText(MainActivity.this, "Dialog Fragment Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i51 = new Intent(MainActivity.this, DialogFragmentActivity.class);
                    startActivity(i51);
                }
                if (position == 52)
                {
                    Toast.makeText(MainActivity.this, "Service Lifecycle Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i52 = new Intent(MainActivity.this, ServiceLifeCycleActivity.class);
                    startActivity(i52);
                }
                if (position == 53)
                {
                    Toast.makeText(MainActivity.this, "Service Example Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i53 = new Intent(MainActivity.this, ServiceLifeExampleActivity.class);
                    startActivity(i53);
                }
                if (position == 54)
                {
                    Toast.makeText(MainActivity.this, "Phone Details Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i54 = new Intent(MainActivity.this, PhoneDetailActivity.class);
                    startActivity(i54);
                }
                if (position == 55)
                {
                    Toast.makeText(MainActivity.this, "Read Contacts Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i55 = new Intent(MainActivity.this, ReadContactsActivity.class);
                    startActivity(i55);
                }
                if (position == 56)
                {
                    Toast.makeText(MainActivity.this, "Change Wifi State Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i56 = new Intent(MainActivity.this, ChangeWifiStateActivity.class);
                    startActivity(i56);
                }
                if (position == 57)
                {
                    Toast.makeText(MainActivity.this, "Get Wifi Info Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i57 = new Intent(MainActivity.this, GetWifiInfoActivity.class);
                    startActivity(i57);
                }
                if (position == 58)
                {
                    Toast.makeText(MainActivity.this, "Get Wifi List Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i58 = new Intent(MainActivity.this, GetWifiListActivity.class);
                    startActivity(i58);
                }
                if (position == 59)
                {
                    Toast.makeText(MainActivity.this, "Fade Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i59 = new Intent(MainActivity.this, FadeActivity.class);
                    startActivity(i59);
                }
                if (position == 60)
                {
                    Toast.makeText(MainActivity.this, "Zoom Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i60 = new Intent(MainActivity.this, ZoomActivity.class);
                    startActivity(i60);
                }
                if (position == 61)
                {
                    Toast.makeText(MainActivity.this, "Rotate Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i61 = new Intent(MainActivity.this, RotateActivity.class);
                    startActivity(i61);
                }
                if (position == 62)
                {
                    Toast.makeText(MainActivity.this, "Move Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i62 = new Intent(MainActivity.this, MoveActivity.class);
                    startActivity(i62);
                }
                if (position == 63)
                {
                    Toast.makeText(MainActivity.this, "Slide Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i63 = new Intent(MainActivity.this, SlideActivity.class);
                    startActivity(i63);
                }
                if (position == 64)
                {
                    Toast.makeText(MainActivity.this, "Bounce Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i64 = new Intent(MainActivity.this, BounceActivity.class);
                    startActivity(i64);
                }
                if (position == 65)
                {
                    Toast.makeText(MainActivity.this, "Blink Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i65 = new Intent(MainActivity.this, BlinkActivity.class);
                    startActivity(i65);
                }
                if (position == 66)
                {
                    Toast.makeText(MainActivity.this, "Sequential Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i66 = new Intent(MainActivity.this, SequentialActivity.class);
                    startActivity(i66);
                }
                if (position == 67)
                {
                    Toast.makeText(MainActivity.this, "Together Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i67 = new Intent(MainActivity.this, TogetherActivity.class);
                    startActivity(i67);
                }
                if (position == 68)
                {
                    Toast.makeText(MainActivity.this, "SharedPreference Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i68 = new Intent(MainActivity.this, SharedPreferenceActivity.class);
                    startActivity(i68);
                }
                if (position == 69)
                {
                    Toast.makeText(MainActivity.this, "Internal Storage Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i69 = new Intent(MainActivity.this, InternalStorageActivity.class);
                    startActivity(i69);
                }
                if (position == 70)
                {
                    Toast.makeText(MainActivity.this, "External Storage Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i70 = new Intent(MainActivity.this, ExternalStorageActivity.class);
                    startActivity(i70);
                }
                if (position == 71)
                {
                    Toast.makeText(MainActivity.this, "Cache Storage Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i71 = new Intent(MainActivity.this, CacheStorageActivity.class);
                    startActivity(i71);
                }
                if (position == 72)
                {
                    Toast.makeText(MainActivity.this, "Notification Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i72 = new Intent(MainActivity.this, NotificationActivity.class);
                    startActivity(i72);
                }
                if (position == 73)
                {
                    Toast.makeText(MainActivity.this, "WaveLoading Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i73 = new Intent(MainActivity.this, WaveLoadingActivity.class);
                    startActivity(i73);
                }
                if (position == 74)
                {
                    Toast.makeText(MainActivity.this, "Disable Button Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i74 = new Intent(MainActivity.this, DisableButtonActivity.class);
                    startActivity(i74);
                }
                if (position == 75)
                {
                    Toast.makeText(MainActivity.this, "Font Style Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i75 = new Intent(MainActivity.this, FontStyleActivity.class);
                    startActivity(i75);
                }
                if (position == 76)
                {
                    Toast.makeText(MainActivity.this, "TextInputEditText Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i76 = new Intent(MainActivity.this, TextInputEditTextActivity.class);
                    startActivity(i76);
                }
                if (position == 77)
                {
                    Toast.makeText(MainActivity.this, "FloatingActionBars Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i77 = new Intent(MainActivity.this, FloatingActionBarsActivity.class);
                    startActivity(i77);
                }
                if (position == 78)
                {
                    Toast.makeText(MainActivity.this, "SnackBars Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i78 = new Intent(MainActivity.this, SnackBarsActivity.class);
                    startActivity(i78);
                }
                if (position == 79)
                {
                    Toast.makeText(MainActivity.this, "Bottom Navigation Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i78 = new Intent(MainActivity.this, BottomNavigationActivity.class);
                    startActivity(i78);
                }
                if (position == 80)
                {
                    Toast.makeText(MainActivity.this, "Bottom Sheets Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i80 = new Intent(MainActivity.this, BottomSheetsActivity.class);
                    startActivity(i80);
                }
                if (position == 81)
                {
                    Toast.makeText(MainActivity.this, "Navigation Drawer Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i81 = new Intent(MainActivity.this, NavigationDrawerActivity.class);
                    startActivity(i81);
                }
                if (position == 82)
                {
                    Toast.makeText(MainActivity.this, "Bluetooth Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i81 = new Intent(MainActivity.this, BluetoothActivity.class);
                    startActivity(i81);
                }
                if (position == 83)
                {
                    Toast.makeText(MainActivity.this, "Torch Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i83 = new Intent(MainActivity.this, TorchActivity.class);
                    startActivity(i83);
                }
                if (position == 84)
                {
                    Toast.makeText(MainActivity.this, "TicTacToe Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i84 = new Intent(MainActivity.this, TicTacToeActivity.class);
                    startActivity(i84);
                }
                if (position == 85)
                {
                    Toast.makeText(MainActivity.this, "Calculator Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i85 = new Intent(MainActivity.this, CalculatorActivity.class);
                    startActivity(i85);
                }
                if (position == 86)
                {
                    Toast.makeText(MainActivity.this, "WallpaperButton Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i86 = new Intent(MainActivity.this, WallpaperButton.class);
                    startActivity(i86);
                }
                if (position == 87)
                {
                    Toast.makeText(MainActivity.this, "TextToToast Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i87 = new Intent(MainActivity.this, TextToToastActivity.class);
                    startActivity(i87);
                }
                if (position == 88)
                {
                    Toast.makeText(MainActivity.this, "RandomNumberGenerator Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i88 = new Intent(MainActivity.this, RandomNumberGeneratorActivity.class);
                    startActivity(i88);
                }
                if (position == 89)
                {
                    Toast.makeText(MainActivity.this, "RandomColorGenerator Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i89 = new Intent(MainActivity.this, RandomColorGeneratorActivity.class);
                    startActivity(i89);
                }
                if(position == 90)
                {
                    Toast.makeText(MainActivity.this, "ColorSeekBar Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i90 = new Intent(MainActivity.this, ColorSeekBarActivity.class);
                    startActivity(i90);
                }
                if(position == 91)
                {
                    Toast.makeText(MainActivity.this, "ColorPicker Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i91 = new Intent(MainActivity.this, ColorPickerActivity.class);
                    startActivity(i91);
                }
                if(position == 92)
                {
                    Toast.makeText(MainActivity.this, "ScratchView Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i92 = new Intent(MainActivity.this, ScratchViewActivity.class);
                    startActivity(i92);
                }
                if(position == 93)
                {
                    Toast.makeText(MainActivity.this, "Brightness Bitmap Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i93 = new Intent(MainActivity.this, BrightnessBitmapActivity.class);
                    startActivity(i93);
                }
                if(position == 94)
                {
                    Toast.makeText(MainActivity.this, "Seekbar Background Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i94 = new Intent(MainActivity.this, SeekbarBackgroundActivity.class);
                    startActivity(i94);
                }
                if(position == 95)
                {
                    Toast.makeText(MainActivity.this, "Shared Element Preference Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i95 = new Intent(MainActivity.this, SharedElementPreferenceActivity.class);
                    startActivity(i95);
                }
                if(position == 96)
                {
                    Toast.makeText(MainActivity.this, "Styleable Toast Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i96 = new Intent(MainActivity.this, StyleableToastActivity.class);
                    startActivity(i96);
                }
                if(position == 97)
                {
                    Toast.makeText(MainActivity.this, "Vibrate by Click Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i97 = new Intent(MainActivity.this, VibrateActivity.class);
                    startActivity(i97);
                }
                if(position == 98)
                {
                    Toast.makeText(MainActivity.this, "Sound Click Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i98 = new Intent(MainActivity.this, SoundClickActivity.class);
                    startActivity(i98);
                }
                if(position == 99)
                {
                    Toast.makeText(MainActivity.this, "Spin the bottle Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i99 = new Intent(MainActivity.this, SpintheBottleActivity.class);
                    startActivity(i99);
                }
                if(position == 100)
                {
                    Toast.makeText(MainActivity.this, "ImagesSlider Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i100 = new Intent(MainActivity.this, ImageSliderActivity.class);
                    startActivity(i100);
                }
                if(position == 101)
                {
                    Toast.makeText(MainActivity.this, "CountDown Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i101 = new Intent(MainActivity.this, CountDownTimerActivity.class);
                    startActivity(i101);
                }
                if(position == 102)
                {
                    Toast.makeText(MainActivity.this, "Lotties Clicked....", Toast.LENGTH_SHORT).show();

                    Intent i101 = new Intent(MainActivity.this, LottiesActivity.class);
                    startActivity(i101);
                }
                if (position == 103)
                {
                    Intent i103 = new Intent(MainActivity.this , PreLoaderActivity.class);
                    startActivity(i103);
                }


            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rTitle[];
        int rImgs[];

        MyAdapter(Context c, String title[], int imgs[])
        {
            super(c,R.layout.row,R.id.textView1,title);

            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }
}