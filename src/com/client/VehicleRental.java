package com.client;

import java.util.ArrayList;
import java.util.List;

import com.dao.VehicleDao;
import com.dao.VehicleDaoImpl;
import com.exception.DataAccessException;
import com.keyutil.KeyBoardUtil;
import com.model.BookingVO;
import com.model.Vehicle;
import com.model.VehicleCategory;

public class VehicleRental {
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws ParseException
	 * @throws DataAccessException
	 */
	public static void main(String[] args) throws DataAccessException {
		VehicleDao ob = new VehicleDaoImpl();
		while (true) {
			System.out.println("Main Menu");
			System.out.println("1.Add a vehicle");
			System.out.println("2.Book a vehicle");
			System.out.println("3.Show this month's booking report");
			System.out.println("4.Exit");
			int choice = KeyBoardUtil.getInt("Please choose an option [1, 2, 3,4]:");
			switch (choice) {
				case 1:
					System.out.println("Enter Vehicle details:");

					int choice2 = KeyBoardUtil.getInt("Choose a Vehicle Category [1,2,3]");
					ArrayList<VehicleCategory> categories = ob.getVehicleCategory();
					categories.stream().map(VehicleCategory::getCategoryName).forEach(System.out::println);
					switch (choice2) {
						case 1:

							System.out.println();
							Vehicle vehicle = new Vehicle();
							vehicle.setVehicleCat(1);
							vehicle.setRegNo(KeyBoardUtil.getString("Enter Vehicle registration no."));
							vehicle.setManufacturer(KeyBoardUtil.getString("Enter vehicle Manufacturer"));
							vehicle.setDailyRent(KeyBoardUtil.getInt("Enter daily rent"));
							vehicle.setMileage(KeyBoardUtil.getInt("Enter mileage"));
							vehicle.setFuelType(KeyBoardUtil.getString("Enter fuel type"));
							vehicle.setDescription(KeyBoardUtil.getString("Enter description"));

							ob.addVehicle(vehicle);
							System.out.println("Vehicle Added successfully");
							break;

						case 2:
							System.out.println();
							Vehicle vehicle2 = new Vehicle();
							vehicle2.setVehicleCat(2);
							vehicle2.setRegNo(KeyBoardUtil.getString("Enter Vehicle registration no."));
							vehicle2.setManufacturer(KeyBoardUtil.getString("Enter vehicle Manufacturer"));
							vehicle2.setDailyRent(KeyBoardUtil.getInt("Enter daily rent"));
							vehicle2.setMileage(KeyBoardUtil.getInt("Enter mileage"));
							vehicle2.setFuelType(KeyBoardUtil.getString("Enter fuel type"));
							vehicle2.setDescription(KeyBoardUtil.getString("Enter description"));

							ob.addVehicle(vehicle2);
							System.out.println("Vehicle Added successfully");
							break;

						case 3:
							System.out.println();
							Vehicle vehicle3 = new Vehicle();
							vehicle3.setVehicleCat(3);
							vehicle3.setRegNo(KeyBoardUtil.getString("Enter Vehicle registration no."));
							vehicle3.setManufacturer(KeyBoardUtil.getString("Enter vehicle Manufacturer"));
							vehicle3.setDailyRent(KeyBoardUtil.getInt("Enter daily rent"));
							vehicle3.setMileage(KeyBoardUtil.getInt("Enter mileage"));
							vehicle3.setFuelType(KeyBoardUtil.getString("Enter fuel type"));
							vehicle3.setDescription(KeyBoardUtil.getString("Enter description"));

							ob.addVehicle(vehicle3);
							System.out.println("Vehicle Added successfully");

						default:
							System.out.println("Enter valid data");
					}
				case 2:
					BookingVO booking = new BookingVO();
					List<Vehicle> vehicleList;
					try {
						System.out.println("Enter Booking details:");
						booking.setCustomerName(KeyBoardUtil.getString("Enter Your Name"));
						booking.setCategory(KeyBoardUtil.getInt("Enter category of vehicles: [1,2,3]"));
						vehicleList = ob.getVehicles(booking.getCategory());
						System.out.println(vehicleList);
						booking.setRegNo(KeyBoardUtil.getString("Enter registration Number"));
						booking.setTotalRent(KeyBoardUtil.getInt("Enter total fent"));
						booking.setToDate(KeyBoardUtil.getDate("Enter to date"));
						booking.setFromDate(KeyBoardUtil.getDate("Enter from date:"));
						String payment = KeyBoardUtil.getString("Pay now: Y/N");
						if(payment.equalsIgnoreCase("Y")){
							booking.setPaymentReceived(true);
						}
						else{
							booking.setPaymentReceived(false);
						}
						ob.addBooking(booking);
						


					} catch (Exception exception) {
						System.out.println("invalid date format");
					}
					break;
				case 3:
					ob.getBookingReport();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Enter valid Option");

				
			}

		}

	}
}
