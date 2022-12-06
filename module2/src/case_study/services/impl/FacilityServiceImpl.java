package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.services.IFacilityService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    @Override
    public void addFacility(Facility facility, int numberOfUses) {
        facilityIntegerMap.put(facility,numberOfUses);
    }

    @Override
    public Map<Facility,Integer> getFacilitymaintenance() {
        return facilityIntegerMap;
    }

    @Override
    public List<Facility> displays() {
        List<Facility> facilityArrayList = new ArrayList<>();
        Set<Facility> facilityList = facilityIntegerMap.keySet();
        for (Facility key :facilityList) {
            facilityArrayList.add(key);
        }
        return facilityArrayList;
    }
}
