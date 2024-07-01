drop table TRAIN_DETAILS;
CREATE TABLE "TRAIN_DETAILS" 
   (	"TRAIN_NO" NUMBER(6) primary key,
	"TRAIN_NAME" VARCHAR2(64),
    "STATION_FROM" VARCHAR2(16),
    "STATION_END" VARCHAR2(16),
	"TOTAL_AVAILABLE_SEAT" NUMBER(2),
	"COST_ADULT" NUMBER(6),
	"COST_SENIOR" NUMBER(6),
	"COST_CHILD" NUMBER(6)
   );
   
   drop table OFFER;
CREATE TABLE "OFFER" 
   (	"PLACE" VARCHAR2(16) primary key,
	"OFFER_START_DATE"  VARCHAR2(16),
    "OFFER_END_DATE" VARCHAR2(16)
   );
   
    drop table TICKET_BOOKED_HISTORY;
CREATE TABLE "TICKET_BOOKED_HISTORY" 
   (	
   "SEQNO" NUMBER(16) primary key,
	"TRAIN_NO"  NUMBER(6) ,
		"TRAIN_NAME" VARCHAR2(64),
     "STATION_FROM" VARCHAR2(16),
    "STATION_END" VARCHAR2(16),
    "PASSENGER_NAME" VARCHAR2(64),
      "TICKET_AMT" NUMBER(6),
        "TICKET_TYPE" VARCHAR2(1),
       "TRAVEL_DATE" VARCHAR2(16)
    
   );
   
   
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(12707,'Andhra Pradesh Sampark Kranti','Pune','Kochi',30,1000,800,600);
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(15609,'Abadh Assam Express','Pune','Bangalore',10,1000,800,600);
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(12640,'Brindavan Express','Pune','Hyderabad',15,1000,800,600);
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(06039,'Coimbatore Express','Pune','Bhubaneswar',14,1000,800,600);
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(07207,'Bza Sc Special','Pune','Chennai',14,1000,800,600);
insert into TRAIN_DETAILS(TRAIN_NO,TRAIN_NAME,STATION_FROM,STATION_END,TOTAL_AVAILABLE_SEAT,COST_ADULT,COST_SENIOR,COST_CHILD) values(13246,'Capital Express','Pune','New Delhi',14,1000,800,600);

insert into OFFER(PLACE,OFFER_START_DATE,OFFER_END_DATE) values('Kochi','01-07-2024','10-07-2024');
insert into OFFER(PLACE,OFFER_START_DATE,OFFER_END_DATE) values('Bangalore','01-07-2024','10-07-2024');
insert into OFFER(PLACE,OFFER_START_DATE,OFFER_END_DATE) values('Hyderabad','01-07-2024','10-07-2024');
insert into OFFER(PLACE,OFFER_START_DATE,OFFER_END_DATE) values('Bhubaneswar','01-07-2024','10-07-2024');
