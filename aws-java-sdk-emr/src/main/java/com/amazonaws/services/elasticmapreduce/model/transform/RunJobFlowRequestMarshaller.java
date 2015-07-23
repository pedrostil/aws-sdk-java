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
package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Run Job Flow Request Marshaller
 */
public class RunJobFlowRequestMarshaller implements Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    public Request<RunJobFlowRequest> marshall(RunJobFlowRequest runJobFlowRequest) {
        if (runJobFlowRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(runJobFlowRequest, "AmazonElasticMapReduce");
        String target = "ElasticMapReduce.RunJobFlow";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (runJobFlowRequest.getName() != null) {
                jsonWriter.key("Name").value(runJobFlowRequest.getName());
            }
            if (runJobFlowRequest.getLogUri() != null) {
                jsonWriter.key("LogUri").value(runJobFlowRequest.getLogUri());
            }
            if (runJobFlowRequest.getAdditionalInfo() != null) {
                jsonWriter.key("AdditionalInfo").value(runJobFlowRequest.getAdditionalInfo());
            }
            if (runJobFlowRequest.getAmiVersion() != null) {
                jsonWriter.key("AmiVersion").value(runJobFlowRequest.getAmiVersion());
            }
            if (runJobFlowRequest.getReleaseLabel() != null) {
                jsonWriter.key("ReleaseLabel").value(runJobFlowRequest.getReleaseLabel());
            }
            JobFlowInstancesConfig instances = runJobFlowRequest.getInstances();
            if (instances != null) {

                jsonWriter.key("Instances");
                jsonWriter.object();

                if (instances.getMasterInstanceType() != null) {
                    jsonWriter.key("MasterInstanceType").value(instances.getMasterInstanceType());
                }
                if (instances.getSlaveInstanceType() != null) {
                    jsonWriter.key("SlaveInstanceType").value(instances.getSlaveInstanceType());
                }
                if (instances.getInstanceCount() != null) {
                    jsonWriter.key("InstanceCount").value(instances.getInstanceCount());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig> instanceGroupsList = (com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig>)(instances.getInstanceGroups());
                if (instanceGroupsList != null && !(instanceGroupsList.isAutoConstruct() && instanceGroupsList.isEmpty())) {

                    jsonWriter.key("InstanceGroups");
                    jsonWriter.array();

                    for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
                        if (instanceGroupsListValue != null) {
                            jsonWriter.object();
                            if (instanceGroupsListValue.getName() != null) {
                                jsonWriter.key("Name").value(instanceGroupsListValue.getName());
                            }
                            if (instanceGroupsListValue.getMarket() != null) {
                                jsonWriter.key("Market").value(instanceGroupsListValue.getMarket());
                            }
                            if (instanceGroupsListValue.getInstanceRole() != null) {
                                jsonWriter.key("InstanceRole").value(instanceGroupsListValue.getInstanceRole());
                            }
                            if (instanceGroupsListValue.getBidPrice() != null) {
                                jsonWriter.key("BidPrice").value(instanceGroupsListValue.getBidPrice());
                            }
                            if (instanceGroupsListValue.getInstanceType() != null) {
                                jsonWriter.key("InstanceType").value(instanceGroupsListValue.getInstanceType());
                            }
                            if (instanceGroupsListValue.getInstanceCount() != null) {
                                jsonWriter.key("InstanceCount").value(instanceGroupsListValue.getInstanceCount());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>)(instanceGroupsListValue.getConfigurations());
                            if (configurationsList != null && !(configurationsList.isAutoConstruct() && configurationsList.isEmpty())) {

                                jsonWriter.key("Configurations");
                                jsonWriter.array();

                                for (Configuration configurationsListValue : configurationsList) {
                                    if (configurationsListValue != null) {
                                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonWriter);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                if (instances.getEc2KeyName() != null) {
                    jsonWriter.key("Ec2KeyName").value(instances.getEc2KeyName());
                }
                PlacementType placement = instances.getPlacement();
                if (placement != null) {

                    jsonWriter.key("Placement");
                    jsonWriter.object();

                    if (placement.getAvailabilityZone() != null) {
                        jsonWriter.key("AvailabilityZone").value(placement.getAvailabilityZone());
                    }
                    jsonWriter.endObject();
                }
                if (instances.isKeepJobFlowAliveWhenNoSteps() != null) {
                    jsonWriter.key("KeepJobFlowAliveWhenNoSteps").value(instances.isKeepJobFlowAliveWhenNoSteps());
                }
                if (instances.isTerminationProtected() != null) {
                    jsonWriter.key("TerminationProtected").value(instances.isTerminationProtected());
                }
                if (instances.getHadoopVersion() != null) {
                    jsonWriter.key("HadoopVersion").value(instances.getHadoopVersion());
                }
                if (instances.getEc2SubnetId() != null) {
                    jsonWriter.key("Ec2SubnetId").value(instances.getEc2SubnetId());
                }
                if (instances.getEmrManagedMasterSecurityGroup() != null) {
                    jsonWriter.key("EmrManagedMasterSecurityGroup").value(instances.getEmrManagedMasterSecurityGroup());
                }
                if (instances.getEmrManagedSlaveSecurityGroup() != null) {
                    jsonWriter.key("EmrManagedSlaveSecurityGroup").value(instances.getEmrManagedSlaveSecurityGroup());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroupsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(instances.getAdditionalMasterSecurityGroups());
                if (additionalMasterSecurityGroupsList != null && !(additionalMasterSecurityGroupsList.isAutoConstruct() && additionalMasterSecurityGroupsList.isEmpty())) {

                    jsonWriter.key("AdditionalMasterSecurityGroups");
                    jsonWriter.array();

                    for (String additionalMasterSecurityGroupsListValue : additionalMasterSecurityGroupsList) {
                        if (additionalMasterSecurityGroupsListValue != null) {
                            jsonWriter.value(additionalMasterSecurityGroupsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroupsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(instances.getAdditionalSlaveSecurityGroups());
                if (additionalSlaveSecurityGroupsList != null && !(additionalSlaveSecurityGroupsList.isAutoConstruct() && additionalSlaveSecurityGroupsList.isEmpty())) {

                    jsonWriter.key("AdditionalSlaveSecurityGroups");
                    jsonWriter.array();

                    for (String additionalSlaveSecurityGroupsListValue : additionalSlaveSecurityGroupsList) {
                        if (additionalSlaveSecurityGroupsListValue != null) {
                            jsonWriter.value(additionalSlaveSecurityGroupsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig> stepsList = (com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig>)(runJobFlowRequest.getSteps());
            if (stepsList != null && !(stepsList.isAutoConstruct() && stepsList.isEmpty())) {

                jsonWriter.key("Steps");
                jsonWriter.array();

                for (StepConfig stepsListValue : stepsList) {
                    if (stepsListValue != null) {
                        jsonWriter.object();
                        if (stepsListValue.getName() != null) {
                            jsonWriter.key("Name").value(stepsListValue.getName());
                        }
                        if (stepsListValue.getActionOnFailure() != null) {
                            jsonWriter.key("ActionOnFailure").value(stepsListValue.getActionOnFailure());
                        }
                        HadoopJarStepConfig hadoopJarStep = stepsListValue.getHadoopJarStep();
                        if (hadoopJarStep != null) {

                            jsonWriter.key("HadoopJarStep");
                            jsonWriter.object();

                            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue> propertiesList = (com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue>)(hadoopJarStep.getProperties());
                            if (propertiesList != null && !(propertiesList.isAutoConstruct() && propertiesList.isEmpty())) {

                                jsonWriter.key("Properties");
                                jsonWriter.array();

                                for (KeyValue propertiesListValue : propertiesList) {
                                    if (propertiesListValue != null) {
                                        jsonWriter.object();
                                        if (propertiesListValue.getKey() != null) {
                                            jsonWriter.key("Key").value(propertiesListValue.getKey());
                                        }
                                        if (propertiesListValue.getValue() != null) {
                                            jsonWriter.key("Value").value(propertiesListValue.getValue());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            if (hadoopJarStep.getJar() != null) {
                                jsonWriter.key("Jar").value(hadoopJarStep.getJar());
                            }
                            if (hadoopJarStep.getMainClass() != null) {
                                jsonWriter.key("MainClass").value(hadoopJarStep.getMainClass());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(hadoopJarStep.getArgs());
                            if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                                jsonWriter.key("Args");
                                jsonWriter.array();

                                for (String argsListValue : argsList) {
                                    if (argsListValue != null) {
                                        jsonWriter.value(argsListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig> bootstrapActionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig>)(runJobFlowRequest.getBootstrapActions());
            if (bootstrapActionsList != null && !(bootstrapActionsList.isAutoConstruct() && bootstrapActionsList.isEmpty())) {

                jsonWriter.key("BootstrapActions");
                jsonWriter.array();

                for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {
                        jsonWriter.object();
                        if (bootstrapActionsListValue.getName() != null) {
                            jsonWriter.key("Name").value(bootstrapActionsListValue.getName());
                        }
                        ScriptBootstrapActionConfig scriptBootstrapAction = bootstrapActionsListValue.getScriptBootstrapAction();
                        if (scriptBootstrapAction != null) {

                            jsonWriter.key("ScriptBootstrapAction");
                            jsonWriter.object();

                            if (scriptBootstrapAction.getPath() != null) {
                                jsonWriter.key("Path").value(scriptBootstrapAction.getPath());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(scriptBootstrapAction.getArgs());
                            if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                                jsonWriter.key("Args");
                                jsonWriter.array();

                                for (String argsListValue : argsList) {
                                    if (argsListValue != null) {
                                        jsonWriter.value(argsListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> supportedProductsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(runJobFlowRequest.getSupportedProducts());
            if (supportedProductsList != null && !(supportedProductsList.isAutoConstruct() && supportedProductsList.isEmpty())) {

                jsonWriter.key("SupportedProducts");
                jsonWriter.array();

                for (String supportedProductsListValue : supportedProductsList) {
                    if (supportedProductsListValue != null) {
                        jsonWriter.value(supportedProductsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig> newSupportedProductsList = (com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig>)(runJobFlowRequest.getNewSupportedProducts());
            if (newSupportedProductsList != null && !(newSupportedProductsList.isAutoConstruct() && newSupportedProductsList.isEmpty())) {

                jsonWriter.key("NewSupportedProducts");
                jsonWriter.array();

                for (SupportedProductConfig newSupportedProductsListValue : newSupportedProductsList) {
                    if (newSupportedProductsListValue != null) {
                        jsonWriter.object();
                        if (newSupportedProductsListValue.getName() != null) {
                            jsonWriter.key("Name").value(newSupportedProductsListValue.getName());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(newSupportedProductsListValue.getArgs());
                        if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                            jsonWriter.key("Args");
                            jsonWriter.array();

                            for (String argsListValue : argsList) {
                                if (argsListValue != null) {
                                    jsonWriter.value(argsListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Application>)(runJobFlowRequest.getApplications());
            if (applicationsList != null && !(applicationsList.isAutoConstruct() && applicationsList.isEmpty())) {

                jsonWriter.key("Applications");
                jsonWriter.array();

                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {
                        jsonWriter.object();
                        if (applicationsListValue.getName() != null) {
                            jsonWriter.key("Name").value(applicationsListValue.getName());
                        }
                        if (applicationsListValue.getVersion() != null) {
                            jsonWriter.key("Version").value(applicationsListValue.getVersion());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(applicationsListValue.getArgs());
                        if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                            jsonWriter.key("Args");
                            jsonWriter.array();

                            for (String argsListValue : argsList) {
                                if (argsListValue != null) {
                                    jsonWriter.value(argsListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (applicationsListValue.getAdditionalInfo() != null) {
                            jsonWriter.key("AdditionalInfo");
                            jsonWriter.object();
                            for (Map.Entry<String, String> additionalInfoListValue : applicationsListValue.getAdditionalInfo().entrySet()) {
                                if (additionalInfoListValue.getValue() != null) {
                                    jsonWriter.key(additionalInfoListValue.getKey());

                                    jsonWriter.value(additionalInfoListValue.getValue());
                                }
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>)(runJobFlowRequest.getConfigurations());
            if (configurationsList != null && !(configurationsList.isAutoConstruct() && configurationsList.isEmpty())) {

                jsonWriter.key("Configurations");
                jsonWriter.array();

                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {
                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.isVisibleToAllUsers() != null) {
                jsonWriter.key("VisibleToAllUsers").value(runJobFlowRequest.isVisibleToAllUsers());
            }
            if (runJobFlowRequest.getJobFlowRole() != null) {
                jsonWriter.key("JobFlowRole").value(runJobFlowRequest.getJobFlowRole());
            }
            if (runJobFlowRequest.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(runJobFlowRequest.getServiceRole());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Tag>)(runJobFlowRequest.getTags());
            if (tagsList != null && !(tagsList.isAutoConstruct() && tagsList.isEmpty())) {

                jsonWriter.key("Tags");
                jsonWriter.array();

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {
                        jsonWriter.object();
                        if (tagsListValue.getKey() != null) {
                            jsonWriter.key("Key").value(tagsListValue.getKey());
                        }
                        if (tagsListValue.getValue() != null) {
                            jsonWriter.key("Value").value(tagsListValue.getValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
