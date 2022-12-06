package case_study.services;

import case_study.models.facility.Facility;

import java.util.Map;

public interface IFacilityService extends IService{
    void addFacility(Facility facility, int numberOfUses);
    Map<Facility,Integer> getFacilitymaintenance();
}
