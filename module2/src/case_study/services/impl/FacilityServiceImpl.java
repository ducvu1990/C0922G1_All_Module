package case_study.services.impl;

import case_study.models.Person.Employee;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.IFacilityService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private final String PATH_VILLA_FILE = "src/case_study/data/villa.csv";
    private final String PATH_ROOM_FILE = "src/case_study/data/room.csv";
    private final IOFuramaService ioFuramaService = new IOFuramaService();

    @Override
    public void addFacility(Facility facility, int numberOfUses) {
        if (facility.getServiceCode().matches("^SVVL-[0-9]{4}")){
            List<String> arrayReadFromFile = ioFuramaService.readData(PATH_VILLA_FILE);
            arrayReadFromFile.add(facility.toString()+","+numberOfUses);
            ioFuramaService.writeData(PATH_VILLA_FILE,arrayReadFromFile);
        }else {
            List<String> arrayReadFromFile = ioFuramaService.readData(PATH_ROOM_FILE);
            arrayReadFromFile.add(facility.toString()+","+numberOfUses);
            ioFuramaService.writeData(PATH_ROOM_FILE,arrayReadFromFile);
        }
    }

    @Override
    public Map<Facility, Integer> getFacilitymaintenance() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        int value;
        List<String> arrayReadFromFileVilla = ioFuramaService.readData(PATH_VILLA_FILE);
        if (arrayReadFromFileVilla == null){

        }else {
            for (String item : arrayReadFromFileVilla) {
                String[] arraysUsedToCreateObjects = item.split(",");
                value = Integer.parseInt(arraysUsedToCreateObjects[9]);
                if (value < 5){
                    facilityIntegerMap.put(new Villa(arraysUsedToCreateObjects), value);
                }
            }
        }

        List<String> arrayReadFromFileRoom = ioFuramaService.readData(PATH_ROOM_FILE);
        if (arrayReadFromFileRoom == null){
            return facilityIntegerMap;
        }else {
            for (String item : arrayReadFromFileRoom) {
                String[] arraysUsedToCreateObjects = item.split(",");
                value = Integer.parseInt(arraysUsedToCreateObjects[7]);
                if (value < 5){
                    facilityIntegerMap.put(new Room(arraysUsedToCreateObjects), value);
                }
            }
        }
        return facilityIntegerMap;
    }

    @Override
    public List<Facility> displays() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        List<Facility> facilityArrayList = new ArrayList<>();
        int value;
        List<String> arrayReadFromFileVilla = ioFuramaService.readData(PATH_VILLA_FILE);
        if (arrayReadFromFileVilla == null){

        }else {
            for (String item : arrayReadFromFileVilla) {
                String[] arraysUsedToCreateObjects = item.split(",");
                value = Integer.parseInt(arraysUsedToCreateObjects[9]);
                if (value < 5){
                    facilityIntegerMap.put(new Villa(arraysUsedToCreateObjects), value);
                }
            }
        }

        List<String> arrayReadFromFileRoom = ioFuramaService.readData(PATH_ROOM_FILE);
        if (arrayReadFromFileRoom == null){
            return facilityArrayList;
        }else {
            for (String item : arrayReadFromFileRoom) {
                String[] arraysUsedToCreateObjects = item.split(",");
                value = Integer.parseInt(arraysUsedToCreateObjects[7]);
                if (value < 5){
                    facilityIntegerMap.put(new Room(arraysUsedToCreateObjects), value);
                }
            }
        }
        Set<Facility> facilityList = facilityIntegerMap.keySet();
        for (Facility key : facilityList) {
            facilityArrayList.add(key);
        }
        return facilityArrayList;
    }

    public boolean checkServiceCode(String serviceCode) {
        List<String> arraysUsedToCreateFacility = new ArrayList<>();
        if (serviceCode.matches("^SVVL-[0-9]{4}")) {
            arraysUsedToCreateFacility = ioFuramaService.readData(PATH_VILLA_FILE);
            for (String item : arraysUsedToCreateFacility) {
                String[] arrayVila = item.split(",");
                if (arrayVila[0].equals(serviceCode)){
                    return true;
                }
            }
            return false;
        } else {
            arraysUsedToCreateFacility = ioFuramaService.readData(PATH_ROOM_FILE);
            for (String item : arraysUsedToCreateFacility) {
                String[] arrayVila = item.split(",");
                if (arrayVila[0].equals(serviceCode)){
                    return true;
                }
            }
            return false;
        }
    }
}
