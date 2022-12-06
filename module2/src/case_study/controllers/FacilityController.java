package case_study.controllers;

import case_study.models.facility.Facility;
import case_study.services.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private final FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public void addFacility(Facility facility, int numberOfUses) {
        this.facilityService.addFacility(facility,numberOfUses);
    }
    public Map<Facility,Integer> displayFacilitymaintenance() {
        return facilityService.getFacilitymaintenance();
    }
    public List<Facility> displays() {
        return facilityService.displays();
    }
}
