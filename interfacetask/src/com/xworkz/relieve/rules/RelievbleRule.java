package com.xworkz.relieve.rules;
  import com.xworkz.relieve.company.*;
  
  import com.xworkz.relieve.employee.*;
  
public interface RelievbleRule {
int NOTICE_PERIOD_DAYS = 30; //public static final by default ;
boolean completedBond();
int servedNoticePeriod();
}
