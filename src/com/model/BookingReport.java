package com.model;

import java.util.ArrayList;

public class BookingReport {

	ArrayList<ReportData> reportData = new ArrayList<ReportData>();

	public ArrayList<ReportData> getReportData() {
		return reportData;
	}

	public void setReportData(ArrayList<ReportData> bookings) {
		this.reportData = bookings;
	}

	public void showReportdata() {
		ArrayList<String> categories = new ArrayList<String>();
		categories.add("Bus");
		categories.add("Car");
		categories.add("Truck");
		for(int i=0;i<3;i++){
			if(reportData.get(i).getNumberOfVehicles()==0){
				continue; 
			}
			else{
				System.out.println(categories.get(i)+" "+reportData.get(i).getNumberOfVehicles()+" "+reportData.get(i).getNumberOfVehiclesRented()+" "+reportData.get(i).getTotalRentEarned());
			}
		}
			
		}

	}


