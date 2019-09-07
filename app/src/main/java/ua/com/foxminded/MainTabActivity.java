package ua.com.foxminded;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import ua.com.foxminded.view.TabCollections;
import ua.com.foxminded.view.TabMaps;

/**
 * Create application Collections and Maps. It should contain one screen (Activity).
 * And two tabs (Fragments): Collections and Maps.
 * Collections (ArrayList, LinkedList, CopyOnWriteArrayList):
 * Input: number of element to compare. I would recommend (1’000’000 - 10’000’000)
 * Output: grid with 8x3=24 cell (time in milliseconds):
 * Adding in the beginning;
 * Adding in the middle;
 * Adding in the end;
 * Search by value;
 * Removing in the beginning;
 * Removing in the middle;
 * Removing in the end.
 * Maps (TreeMap, HashMap):
 * Input: number of element to compare. I would recommend (1’000’000 - 10’000’000)
 * Output: grid with 3x2=4 cell (time in milliseconds):
 * Adding new;
 * Search by key;
 * Removing;
 * Application should have button “Calculate”.
 * When user click on it he can see loading.
 * Process can take a few seconds and should be saved, when Activity is destroyed.
 * Use ButterKnife for binding view
 * -------------------------------Review-------------------------------
 * + Вроде пока нормально) Только группируй в пакеты классы; +
 * + Создание адаптера нужно вынести из Активити; +
 * + Попробуй всё таки убрать тулбар)
 * Обработку выполняй в отдельном потоке, пока показывается прогресс;
 * Также сделай кнопку и инпут общими на активити.
 * Чтобы можно было их использовать в обеих фрагментах;
 * Для таблиц используй специальные вью.
 * Почитай про TableLayout и GridView и выбери что тебе больше подходит.
 * И конечно же строки для xml хранить в strings, а не хардкодить, но думаю ты это знаешь)
 *
 * Вроде всё, на первый взгляд)
 */
public class MainTabActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_tab);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }
}
