package com.example.eida.traintracker;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.eida.traintracker.AdapterClass.TrainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Train> trainList = new ArrayList<>();
    private TrainAdapter mAdapter;

    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.trainNameCodelist);

        mAdapter = new TrainAdapter(trainList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.VERTICAL, 30));
        recyclerView.setAdapter(mAdapter);



        prepareTrainData();


    }

    private void prepareTrainData() {

        Train train;

        train = new Train("Subarna Express", "Click Here to track the train", "TR 701");
        trainList.add(train);

        train = new Train("Subarna Express", "Click Here to track the train", "TR 702");
        trainList.add(train);

        train = new Train("Mohanagar Goduli", "Click Here to track the train", "TR 703");
        trainList.add(train);

        train = new Train("Mohanagar Provati", "Click Here to track the train", "TR 704");
        trainList.add(train);

        train = new Train("Ekota Express", "Click Here to track the train", "TR 705");
        trainList.add(train);

        train = new Train("Ekota Express", "Click Here to track the train", "TR 706");
        trainList.add(train);

        train = new Train("Tista Express", "Click Here to track the train", "TR 707");
        trainList.add(train);

        train = new Train("Tista Express", "Click Here to track the train", "TR 708");
        trainList.add(train);

        train = new Train("Parabat  Express", "Click Here to track the train", "TR 709");
        trainList.add(train);

        train = new Train("Parabat  Express", "Click Here to track the train", "TR 710");
        trainList.add(train);

        train = new Train("Upukol Express", "Click Here to track the train", "TR 711");
        trainList.add(train);

        train = new Train("Upukol Express", "Click Here to track the train", "TR 712");
        trainList.add(train);

        train = new Train("Joyantika Express", "Click Here to track the train", "TR 717");
        trainList.add(train);

        train = new Train("Joyantika Express", "Click Here to track the train", "TR 718");
        trainList.add(train);

        train = new Train("Paharia Express", "Click Here to track the train", "TR 719");
        trainList.add(train);

        train = new Train("Paharia Express", "Click Here to track the train", "TR 720");
        trainList.add(train);

        train = new Train("Mohanagar Provati", "Click Here to track the train", "TR 721");
        trainList.add(train);

        train = new Train("Mohanagar Goduli", "Click Here to track the train", "TR 722");
        trainList.add(train);

        train = new Train("Uddayan Express", "Click Here to track the train", "TR 723");
        trainList.add(train);

        train = new Train("Uddayan Express", "Click Here to track the train", "TR 724");
        trainList.add(train);

        train = new Train("Megna Express", "Click Here to track the train", "TR 729");
        trainList.add(train);

        train = new Train("Megna Express", "Click Here to track the train", "TR 730");
        trainList.add(train);

        train = new Train("Agnibina Express", "Click Here to track the train", "TR 735");
        trainList.add(train);

        train = new Train("Agnibina Express", "Click Here to track the train", "TR 736");
        trainList.add(train);

        train = new Train("Egarosindhur Provati", "Click Here to track the train", "TR 737");
        trainList.add(train);

        train = new Train("Egarosindhur Provati", "Click Here to track the train", "TR 738");
        trainList.add(train);

        train = new Train("Upaban Express", "Click Here to track the train", "TR 739");
        trainList.add(train);
        train = new Train("Upaban Express", "Click Here to track the train", "2015");
        trainList.add(train);
        train = new Train("Turna Express", "Click Here to track the train", "TR 741");
        trainList.add(train);
        train = new Train("Turna Express", "Click Here to track the train", "TR 742");
        trainList.add(train);
        train = new Train("Bharamaputra", "Click Here to track the train", "TR 743");
        trainList.add(train);
        train = new Train("Bharamaputra", "Click Here to track the train", "TR 744");
        trainList.add(train);
        train = new Train("Jamuna Express", "Click Here to track the train", "TR 745");
        trainList.add(train);
        train = new Train("Jamuna Express", "Click Here to track the train", "TR 746");
        trainList.add(train);
        train = new Train("Egarosindhur Goduli", "Click Here to track the train", "TR 749");
        trainList.add(train);
        train = new Train("Egarosindhur Goduli", "Click Here to track the train", "TR 750");
        trainList.add(train);
        train = new Train("Lalmoni Express", "Click Here to track the train", "TR 751");
        trainList.add(train);
        train = new Train("Lalmoni Express", "Click Here to track the train", "TR 752");
        trainList.add(train);
        train = new Train("Drutojan Express", "Click Here to track the train", "TR 757");
        trainList.add(train);
        train = new Train("Drutojan Express", "Click Here to track the train", "TR 758");
        trainList.add(train);
        train = new Train("Dolonchapa Express", "Click Here to track the train", "TR 767");
        trainList.add(train);
        train = new Train("Dolonchapa Express", "Click Here to track the train", "TR 768");
        trainList.add(train);
        train = new Train("Rangpur Express", "Click Here to track the train", "TR 771");
        trainList.add(train);
        train = new Train("Rangpur Express", "Click Here to track the train", "TR 772");
        trainList.add(train);
        train = new Train("Kalani Express", "Click Here to track the train", "TR 773");
        trainList.add(train);
        train = new Train("Kalani Express", "Click Here to track the train", "TR 774");
        trainList.add(train);
        train = new Train("Sirajgong Express", "Click Here to track the train", "TR 775");
        trainList.add(train);
        train = new Train("Sirajgong Express", "Click Here to track the train", "TR 776");
        trainList.add(train);
        train = new Train("Kapotaskh express", "Click Here to track the train", "TR 715");
        trainList.add(train);
        train = new Train("Kapotaskh express", "Click Here to track the train", "TR 716");
        trainList.add(train);
        train = new Train("Sundarban express", "Click Here to track the train", "TR 725");
        trainList.add(train);
        train = new Train("Sundarban express", "Click Here to track the train", "TR 726");
        trainList.add(train);
        train = new Train("Rupsha express", "Click Here to track the train", "TR 727");
        trainList.add(train);
        train = new Train("Rupsha express", "Click Here to track the train", "TR 728");
        trainList.add(train);
        train = new Train("Barendra express", "Click Here to track the train", "TR 731");
        trainList.add(train);
        train = new Train("Barendra express", "Click Here to track the train", "TR 732");
        trainList.add(train);
        train = new Train("Titumir express", "Click Here to track the train", "TR 733");
        trainList.add(train);
        train = new Train("Titumir express", "Click Here to track the train", "TR 734");
        trainList.add(train);
        train = new Train("Simanta express", "Click Here to track the train", "TR 747");
        trainList.add(train);
        train = new Train("Simanta express", "Click Here to track the train", "TR 748");
        trainList.add(train);
        train = new Train("Silk city express", "Click Here to track the train", "TR 753");
        trainList.add(train);
        train = new Train("Silk city express", "Click Here to track the train", "TR 754");
        trainList.add(train);
        train = new Train("Madhumati express", "Click Here to track the train", "TR 755");
        trainList.add(train);
        train = new Train("Madhumati express", "Click Here to track the train", "TR 756");
        trainList.add(train);
        train = new Train("Padma Express", "Click Here to track the train", "TR 759");
        trainList.add(train);
        train = new Train("Padma Express", "Click Here to track the train", "TR 760");
        trainList.add(train);
        train = new Train("Sagardari Express", "Click Here to track the train", "TR 761");
        trainList.add(train);
        train = new Train("Sagardari Express", "Click Here to track the train", "TR 762");
        trainList.add(train);
        train = new Train("Chittra Express", "Click Here to track the train", "TR 763");
        trainList.add(train);
        train = new Train("Chittra Express", "Click Here to track the train", "TR 764");
        trainList.add(train);
        train = new Train("Nilsagar", "Click Here to track the train", "TR 765");
        trainList.add(train);
        train = new Train("Nilsagar", "Click Here to track the train", "TR 766");
        trainList.add(train);
        train = new Train("Dhumketue express", "Click Here to track the train", "TR 769");
        trainList.add(train);
        train = new Train("Dhumketue express", "Click Here to track the train", "TR 770");
        trainList.add(train);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);


        searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        searchView.setQueryHint("Enter Train Name");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                s=s.toLowerCase();
                List<Train> mylist = new ArrayList<>();

                for (Train train : trainList){
                    String train_name = train.getTitle().toLowerCase();
                    if (train_name.contains(s)){
                        mylist.add(train);
                    }

                }

                mAdapter.setSearchOperation(mylist);


                return false;
            }
        });




        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

                return super.onOptionsItemSelected(item);

        }
    }
