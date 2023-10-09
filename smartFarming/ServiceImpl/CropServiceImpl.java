package com.smartFarming.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartFarming.Service.CropService;
import com.smartFarming.entities.Crop;
import com.smartFarming.repository.CropRepository;


@Service
public  class CropServiceImpl implements CropService {
	@Autowired
	CropRepository cr;

	@Override
	public Crop addCrop(Crop crop) {
		return cr.save(crop);
	}

	@Override
	public List<Crop> viewAllCrop() {
		List<Crop> c=cr.findAll();
		return c;
	}

	@Override
	public Crop viewcropById(int id) {
		Crop c=cr.findById(id).get();
		return c;
	}
	@Override
	public Crop updatecrop(int id, Crop crop) {
		Crop c=new Crop();
		c.setId(crop.getId());
		c.setName(crop.getName());
		c.setCropType(crop.getCropType());
		c.setPlantingDate(crop.getPlantingDate());
		c.setHarvestDate(crop.getHarvestDate());
		return cr.save(c);
	}

	
	@Override
	public String deletecropById(int id) {
		cr.deleteById(id);
		return "Crop is deleted";
	}

	@Override
	public String deleteAllcrop() {
		cr.deleteAll();
		return "all crop are deleted";
	}

	@Override
	public Crop save(Crop crop) {
		// TODO Auto-generated method stub
		return null;
	}


	}

	

	
	

	
	


