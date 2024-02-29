package com.learning.restDemo.Service;

import com.learning.restDemo.Model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
