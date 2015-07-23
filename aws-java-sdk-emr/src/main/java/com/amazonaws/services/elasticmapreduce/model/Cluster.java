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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The detailed description of the cluster.
 * </p>
 */
public class Cluster implements Serializable, Cloneable {

    /**
     * The unique identifier for the cluster.
     */
    private String id;

    /**
     * The name of the cluster.
     */
    private String name;

    /**
     * The current status details about the cluster.
     */
    private ClusterStatus status;

    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and
     * so on.
     */
    private Ec2InstanceAttributes ec2InstanceAttributes;

    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     */
    private String logUri;

    /**
     * The AMI version requested for this cluster.
     */
    private String requestedAmiVersion;

    /**
     * The AMI version running on this cluster.
     */
    private String runningAmiVersion;

    /**
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and
     * 2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     */
    private String releaseLabel;

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     */
    private Boolean autoTerminate;

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     */
    private Boolean terminationProtected;

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     */
    private Boolean visibleToAllUsers;

    /**
     * The applications installed on this cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Application> applications;

    /**
     * A list of tags associated with a cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     */
    private String serviceRole;

    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     */
    private Integer normalizedInstanceHours;

    /**
     * The public DNS name of the master EC2 instance.
     */
    private String masterPublicDnsName;

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * Configurations supplied to the EMR cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurations;

    /**
     * The unique identifier for the cluster.
     *
     * @return The unique identifier for the cluster.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique identifier for the cluster.
     *
     * @param id The unique identifier for the cluster.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique identifier for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique identifier for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the cluster.
     *
     * @return The name of the cluster.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the cluster.
     *
     * @param name The name of the cluster.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current status details about the cluster.
     *
     * @return The current status details about the cluster.
     */
    public ClusterStatus getStatus() {
        return status;
    }
    
    /**
     * The current status details about the cluster.
     *
     * @param status The current status details about the cluster.
     */
    public void setStatus(ClusterStatus status) {
        this.status = status;
    }
    
    /**
     * The current status details about the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current status details about the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and
     * so on.
     *
     * @return Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, key name, subnet ID, IAM instance profile, and
     *         so on.
     */
    public Ec2InstanceAttributes getEc2InstanceAttributes() {
        return ec2InstanceAttributes;
    }
    
    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and
     * so on.
     *
     * @param ec2InstanceAttributes Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, key name, subnet ID, IAM instance profile, and
     *         so on.
     */
    public void setEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
    }
    
    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and
     * so on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceAttributes Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, key name, subnet ID, IAM instance profile, and
     *         so on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
        return this;
    }

    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     *
     * @return The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     *
     * @param logUri The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * The AMI version requested for this cluster.
     *
     * @return The AMI version requested for this cluster.
     */
    public String getRequestedAmiVersion() {
        return requestedAmiVersion;
    }
    
    /**
     * The AMI version requested for this cluster.
     *
     * @param requestedAmiVersion The AMI version requested for this cluster.
     */
    public void setRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
    }
    
    /**
     * The AMI version requested for this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestedAmiVersion The AMI version requested for this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
        return this;
    }

    /**
     * The AMI version running on this cluster.
     *
     * @return The AMI version running on this cluster.
     */
    public String getRunningAmiVersion() {
        return runningAmiVersion;
    }
    
    /**
     * The AMI version running on this cluster.
     *
     * @param runningAmiVersion The AMI version running on this cluster.
     */
    public void setRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
    }
    
    /**
     * The AMI version running on this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningAmiVersion The AMI version running on this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
        return this;
    }

    /**
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and
     * 2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     *
     * @return The release label for the Amazon EMR release. For Amazon EMR 3.x and
     *         2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     */
    public String getReleaseLabel() {
        return releaseLabel;
    }
    
    /**
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and
     * 2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     *
     * @param releaseLabel The release label for the Amazon EMR release. For Amazon EMR 3.x and
     *         2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     */
    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }
    
    /**
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and
     * 2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param releaseLabel The release label for the Amazon EMR release. For Amazon EMR 3.x and
     *         2.x AMIs, use amiVersion instead instead of ReleaseLabel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @return Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public Boolean isAutoTerminate() {
        return autoTerminate;
    }
    
    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @param autoTerminate Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public void setAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
    }
    
    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoTerminate Specifies whether the cluster should terminate after completing all
     *         steps.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
        return this;
    }

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @return Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public Boolean getAutoTerminate() {
        return autoTerminate;
    }

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @param terminationProtected Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }
    
    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationProtected Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @return Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }
    
    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @param visibleToAllUsers Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }
    
    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibleToAllUsers Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @return Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * The applications installed on this cluster.
     *
     * @return The applications installed on this cluster.
     */
    public java.util.List<Application> getApplications() {
        if (applications == null) {
              applications = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>();
              applications.setAutoConstruct(true);
        }
        return applications;
    }
    
    /**
     * The applications installed on this cluster.
     *
     * @param applications The applications installed on this cluster.
     */
    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
        applicationsCopy.addAll(applications);
        this.applications = applicationsCopy;
    }
    
    /**
     * The applications installed on this cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setApplications(java.util.Collection)} or {@link
     * #withApplications(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications The applications installed on this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withApplications(Application... applications) {
        if (getApplications() == null) setApplications(new java.util.ArrayList<Application>(applications.length));
        for (Application value : applications) {
            getApplications().add(value);
        }
        return this;
    }
    
    /**
     * The applications installed on this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications The applications installed on this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
            applicationsCopy.addAll(applications);
            this.applications = applicationsCopy;
        }

        return this;
    }

    /**
     * A list of tags associated with a cluster.
     *
     * @return A list of tags associated with a cluster.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags associated with a cluster.
     *
     * @param tags A list of tags associated with a cluster.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags associated with a cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags associated with a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags associated with a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags associated with a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     *
     * @return The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     */
    public String getServiceRole() {
        return serviceRole;
    }
    
    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }
    
    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @return An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
        return this;
    }

    /**
     * The public DNS name of the master EC2 instance.
     *
     * @return The public DNS name of the master EC2 instance.
     */
    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }
    
    /**
     * The public DNS name of the master EC2 instance.
     *
     * @param masterPublicDnsName The public DNS name of the master EC2 instance.
     */
    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }
    
    /**
     * The public DNS name of the master EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterPublicDnsName The public DNS name of the master EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
        return this;
    }

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * Configurations supplied to the EMR cluster.
     *
     * @return <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         Configurations supplied to the EMR cluster.
     */
    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
              configurations = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>();
              configurations.setAutoConstruct(true);
        }
        return configurations;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * Configurations supplied to the EMR cluster.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         Configurations supplied to the EMR cluster.
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
        configurationsCopy.addAll(configurations);
        this.configurations = configurationsCopy;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * Configurations supplied to the EMR cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigurations(java.util.Collection)} or {@link
     * #withConfigurations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         Configurations supplied to the EMR cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) setConfigurations(new java.util.ArrayList<Configuration>(configurations.length));
        for (Configuration value : configurations) {
            getConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * Configurations supplied to the EMR cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         Configurations supplied to the EMR cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
            configurationsCopy.addAll(configurations);
            this.configurations = configurationsCopy;
        }

        return this;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getEc2InstanceAttributes() != null) sb.append("Ec2InstanceAttributes: " + getEc2InstanceAttributes() + ",");
        if (getLogUri() != null) sb.append("LogUri: " + getLogUri() + ",");
        if (getRequestedAmiVersion() != null) sb.append("RequestedAmiVersion: " + getRequestedAmiVersion() + ",");
        if (getRunningAmiVersion() != null) sb.append("RunningAmiVersion: " + getRunningAmiVersion() + ",");
        if (getReleaseLabel() != null) sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (isAutoTerminate() != null) sb.append("AutoTerminate: " + isAutoTerminate() + ",");
        if (isTerminationProtected() != null) sb.append("TerminationProtected: " + isTerminationProtected() + ",");
        if (isVisibleToAllUsers() != null) sb.append("VisibleToAllUsers: " + isVisibleToAllUsers() + ",");
        if (getApplications() != null) sb.append("Applications: " + getApplications() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNormalizedInstanceHours() != null) sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() + ",");
        if (getMasterPublicDnsName() != null) sb.append("MasterPublicDnsName: " + getMasterPublicDnsName() + ",");
        if (getConfigurations() != null) sb.append("Configurations: " + getConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceAttributes() == null) ? 0 : getEc2InstanceAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode()); 
        hashCode = prime * hashCode + ((getRequestedAmiVersion() == null) ? 0 : getRequestedAmiVersion().hashCode()); 
        hashCode = prime * hashCode + ((getRunningAmiVersion() == null) ? 0 : getRunningAmiVersion().hashCode()); 
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode()); 
        hashCode = prime * hashCode + ((isAutoTerminate() == null) ? 0 : isAutoTerminate().hashCode()); 
        hashCode = prime * hashCode + ((isTerminationProtected() == null) ? 0 : isTerminationProtected().hashCode()); 
        hashCode = prime * hashCode + ((isVisibleToAllUsers() == null) ? 0 : isVisibleToAllUsers().hashCode()); 
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode()); 
        hashCode = prime * hashCode + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours().hashCode()); 
        hashCode = prime * hashCode + ((getMasterPublicDnsName() == null) ? 0 : getMasterPublicDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Cluster == false) return false;
        Cluster other = (Cluster)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getEc2InstanceAttributes() == null ^ this.getEc2InstanceAttributes() == null) return false;
        if (other.getEc2InstanceAttributes() != null && other.getEc2InstanceAttributes().equals(this.getEc2InstanceAttributes()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getRequestedAmiVersion() == null ^ this.getRequestedAmiVersion() == null) return false;
        if (other.getRequestedAmiVersion() != null && other.getRequestedAmiVersion().equals(this.getRequestedAmiVersion()) == false) return false; 
        if (other.getRunningAmiVersion() == null ^ this.getRunningAmiVersion() == null) return false;
        if (other.getRunningAmiVersion() != null && other.getRunningAmiVersion().equals(this.getRunningAmiVersion()) == false) return false; 
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null) return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false) return false; 
        if (other.isAutoTerminate() == null ^ this.isAutoTerminate() == null) return false;
        if (other.isAutoTerminate() != null && other.isAutoTerminate().equals(this.isAutoTerminate()) == false) return false; 
        if (other.isTerminationProtected() == null ^ this.isTerminationProtected() == null) return false;
        if (other.isTerminationProtected() != null && other.isTerminationProtected().equals(this.isTerminationProtected()) == false) return false; 
        if (other.isVisibleToAllUsers() == null ^ this.isVisibleToAllUsers() == null) return false;
        if (other.isVisibleToAllUsers() != null && other.isVisibleToAllUsers().equals(this.isVisibleToAllUsers()) == false) return false; 
        if (other.getApplications() == null ^ this.getApplications() == null) return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false; 
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null) return false;
        if (other.getNormalizedInstanceHours() != null && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false) return false; 
        if (other.getMasterPublicDnsName() == null ^ this.getMasterPublicDnsName() == null) return false;
        if (other.getMasterPublicDnsName() != null && other.getMasterPublicDnsName().equals(this.getMasterPublicDnsName()) == false) return false; 
        if (other.getConfigurations() == null ^ this.getConfigurations() == null) return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false) return false; 
        return true;
    }
    
    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    