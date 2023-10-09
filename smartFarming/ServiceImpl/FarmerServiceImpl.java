package com.smartFarming.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartFarming.Service.FarmerService;
import com.smartFarming.entities.Farmer;
import com.smartFarming.repository.FarmerRepository;



	@Service
	public   class FarmerServiceImpl implements FarmerService {
		@Autowired 
		FarmerRepository fs;

		@Override
		public Farmer addfarmers(Farmer farmer) {
			return fs.save(farmer);
		}
		 

		public List<Farmer> viewAllFarmer() {
			List<Farmer> f=fs.findAll();
			return f;
		}

		@Override
		public Farmer viewfarmerById(int id) {
			Farmer f=fs.findById(id).get();
			return f;
		}

		public Farmer updatefarmer(int id , Farmer farmer) {
			Farmer f=fs.findById(id).get();
			f.setId(farmer.getId());
			f.setName(farmer.getName());
			f.setContractInformation(farmer.getContractInformation());
			f.setAddress(farmer.getAddress());
			return fs.save(f);
		}

		@Override
		public String deletefarmerById(int id) {
			fs.deleteById(id);
			return "Farmer is deleted";
		}

		@Override
		public String deleteAllfarmer() {
			fs.deleteAll();
			return "All farmer are deleted";
		}
	}









