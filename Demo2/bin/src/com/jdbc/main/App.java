package com.jdbc.main;


import com.jdbc.dto.OwnerDTO;
import com.jdbc.service.OwnerService;
import com.jdbc.service.impl.OwnerServiceImpl;
import com.jdbc.util.InputUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	public void run() {
		OwnerService ownerService =new OwnerServiceImpl();
		System.out.println("Welcome to perstiaan");
		try(Scanner sc=new Scanner(System.in)){
			do{
			int choice=	InputUtil.acceptMenuOption(sc);
			switch(choice){
				case 1:
					System.out.println("Enter owner details");
					OwnerDTO ownerDto=InputUtil.acceptOwnerDetailsToSave(sc);
					ownerService.saveOwner(ownerDto);
					System.out.println("owner details saved successfully");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				case 2:
					int ownerID=InputUtil.acceptOwnerIdToOperate(sc);
					ownerDto=ownerService.findOwner(ownerID);
					System.out.println(ownerDto);
					break;
				case 3:
					ownerID=InputUtil.acceptOwnerIdToOperate(sc);
					String petName=InputUtil.acceptPetDetailsToUpdate(sc);
					ownerService.updatePetDetails(ownerID,petName);
					System.out.println("pet details updated successfully");
					break;
				case 4:
					ownerID=InputUtil.acceptOwnerIdToOperate(sc);
					ownerService.deleteOwner(ownerID);
					System.out.println("owner deleted successfully");
					break;
				case 5:
					ownerService.findAllOwners();
					List<OwnerDTO> ownerList=ownerService.findAllOwners();
					ownerList.forEach(System.out::println);
					break;
				case 6:
					String ownerEmailId=InputUtil.acceptOwnerEmailIdToOperate(sc);
					LocalDate petBirthDate=InputUtil.acceptPetBirthDateToOperate(sc);
					ownerList=ownerService.findOwner(ownerEmailId,petBirthDate);
					ownerList.forEach(System.out::println);
					break;

			   }
			}while(InputUtil.wantToContinue(sc));
		}catch(Exception e){
			System.out.println(e.getMessage());

		}
	}
}
