/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the launch specification for an instance.
 * </p>
 */
public class SpotFleetLaunchSpecification implements Serializable, Cloneable {

    /**
     * The ID of the AMI.
     */
    private String imageId;

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * One or more security groups. To request an instance in a nondefault
     * VPC, you must specify the ID of the security group. To request an
     * instance in EC2-Classic or a default VPC, you can specify the name or
     * the ID of the security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroups;

    /**
     * The Base64-encoded MIME user data to make available to the instances.
     */
    private String userData;

    /**
     * Deprecated.
     */
    private String addressingType;

    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     */
    private String instanceType;

    /**
     * Describes Spot Instance placement.
     */
    private SpotPlacement placement;

    /**
     * The ID of the kernel.
     */
    private String kernelId;

    /**
     * The ID of the RAM disk.
     */
    private String ramdiskId;

    /**
     * One or more block device mapping entries.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enable or disable monitoring for the instance.
     */
    private SpotFleetMonitoring monitoring;

    /**
     * The ID of the subnet in which to launch the instance.
     */
    private String subnetId;

    /**
     * One or more network interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfaces;

    /**
     * Describes an IAM instance profile.
     */
    private IamInstanceProfileSpecification iamInstanceProfile;

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. <p>Default:
     * <code>false</code>
     */
    private Boolean ebsOptimized;

    /**
     * The ID of the AMI.
     *
     * @return The ID of the AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI.
     *
     * @param imageId The ID of the AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The name of the key pair.
     *
     * @return The name of the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair.
     *
     * @param keyName The name of the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * One or more security groups. To request an instance in a nondefault
     * VPC, you must specify the ID of the security group. To request an
     * instance in EC2-Classic or a default VPC, you can specify the name or
     * the ID of the security group.
     *
     * @return One or more security groups. To request an instance in a nondefault
     *         VPC, you must specify the ID of the security group. To request an
     *         instance in EC2-Classic or a default VPC, you can specify the name or
     *         the ID of the security group.
     */
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * One or more security groups. To request an instance in a nondefault
     * VPC, you must specify the ID of the security group. To request an
     * instance in EC2-Classic or a default VPC, you can specify the name or
     * the ID of the security group.
     *
     * @param securityGroups One or more security groups. To request an instance in a nondefault
     *         VPC, you must specify the ID of the security group. To request an
     *         instance in EC2-Classic or a default VPC, you can specify the name or
     *         the ID of the security group.
     */
    public void setSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * One or more security groups. To request an instance in a nondefault
     * VPC, you must specify the ID of the security group. To request an
     * instance in EC2-Classic or a default VPC, you can specify the name or
     * the ID of the security group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or {@link
     * #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups. To request an instance in a nondefault
     *         VPC, you must specify the ID of the security group. To request an
     *         instance in EC2-Classic or a default VPC, you can specify the name or
     *         the ID of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withSecurityGroups(GroupIdentifier... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<GroupIdentifier>(securityGroups.length));
        for (GroupIdentifier value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * One or more security groups. To request an instance in a nondefault
     * VPC, you must specify the ID of the security group. To request an
     * instance in EC2-Classic or a default VPC, you can specify the name or
     * the ID of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups. To request an instance in a nondefault
     *         VPC, you must specify the ID of the security group. To request an
     *         instance in EC2-Classic or a default VPC, you can specify the name or
     *         the ID of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * The Base64-encoded MIME user data to make available to the instances.
     *
     * @return The Base64-encoded MIME user data to make available to the instances.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The Base64-encoded MIME user data to make available to the instances.
     *
     * @param userData The Base64-encoded MIME user data to make available to the instances.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The Base64-encoded MIME user data to make available to the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData The Base64-encoded MIME user data to make available to the instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getAddressingType() {
        return addressingType;
    }
    
    /**
     * Deprecated.
     *
     * @param addressingType Deprecated.
     */
    public void setAddressingType(String addressingType) {
        this.addressingType = addressingType;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addressingType Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withAddressingType(String addressingType) {
        this.addressingType = addressingType;
        return this;
    }

    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @return The instance type.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public SpotFleetLaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public SpotFleetLaunchSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * Describes Spot Instance placement.
     *
     * @return Describes Spot Instance placement.
     */
    public SpotPlacement getPlacement() {
        return placement;
    }
    
    /**
     * Describes Spot Instance placement.
     *
     * @param placement Describes Spot Instance placement.
     */
    public void setPlacement(SpotPlacement placement) {
        this.placement = placement;
    }
    
    /**
     * Describes Spot Instance placement.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Describes Spot Instance placement.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withPlacement(SpotPlacement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * The ID of the kernel.
     *
     * @return The ID of the kernel.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel.
     *
     * @param kernelId The ID of the kernel.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The ID of the kernel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk.
     *
     * @return The ID of the RAM disk.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     *
     * @param ramdiskId The ID of the RAM disk.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ID of the RAM disk.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * One or more block device mapping entries.
     *
     * @return One or more block device mapping entries.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * One or more block device mapping entries.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * Enable or disable monitoring for the instance.
     *
     * @return Enable or disable monitoring for the instance.
     */
    public SpotFleetMonitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * Enable or disable monitoring for the instance.
     *
     * @param monitoring Enable or disable monitoring for the instance.
     */
    public void setMonitoring(SpotFleetMonitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Enable or disable monitoring for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Enable or disable monitoring for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withMonitoring(SpotFleetMonitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * The ID of the subnet in which to launch the instance.
     *
     * @return The ID of the subnet in which to launch the instance.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet in which to launch the instance.
     *
     * @param subnetId The ID of the subnet in which to launch the instance.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet in which to launch the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet in which to launch the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * One or more network interfaces.
     *
     * @return One or more network interfaces.
     */
    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * One or more network interfaces.
     *
     * @param networkInterfaces One or more network interfaces.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkInterfaces(java.util.Collection)} or
     * {@link #withNetworkInterfaces(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        for (InstanceNetworkInterfaceSpecification value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * Describes an IAM instance profile.
     *
     * @return Describes an IAM instance profile.
     */
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * Describes an IAM instance profile.
     *
     * @param iamInstanceProfile Describes an IAM instance profile.
     */
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * Describes an IAM instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile Describes an IAM instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. <p>Default:
     * <code>false</code>
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. <p>Default:
     *         <code>false</code>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getAddressingType() != null) sb.append("AddressingType: " + getAddressingType() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getMonitoring() != null) sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getNetworkInterfaces() != null) sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getAddressingType() == null) ? 0 : getAddressingType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotFleetLaunchSpecification == false) return false;
        SpotFleetLaunchSpecification other = (SpotFleetLaunchSpecification)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getAddressingType() == null ^ this.getAddressingType() == null) return false;
        if (other.getAddressingType() != null && other.getAddressingType().equals(this.getAddressingType()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getMonitoring() == null ^ this.getMonitoring() == null) return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null) return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        return true;
    }
    
    @Override
    public SpotFleetLaunchSpecification clone() {
        try {
            return (SpotFleetLaunchSpecification) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    