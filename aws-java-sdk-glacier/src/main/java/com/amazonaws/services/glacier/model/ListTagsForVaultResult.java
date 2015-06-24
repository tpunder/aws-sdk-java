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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class ListTagsForVaultResult implements Serializable, Cloneable {

    /**
     * The tags attached to the vault. Each tag is composed of a key and a
     * value.
     */
    private java.util.Map<String,String> tags;

    /**
     * The tags attached to the vault. Each tag is composed of a key and a
     * value.
     *
     * @return The tags attached to the vault. Each tag is composed of a key and a
     *         value.
     */
    public java.util.Map<String,String> getTags() {
        
        if (tags == null) {
            tags = new java.util.HashMap<String,String>();
        }
        return tags;
    }
    
    /**
     * The tags attached to the vault. Each tag is composed of a key and a
     * value.
     *
     * @param tags The tags attached to the vault. Each tag is composed of a key and a
     *         value.
     */
    public void setTags(java.util.Map<String,String> tags) {
        this.tags = tags;
    }
    
    /**
     * The tags attached to the vault. Each tag is composed of a key and a
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags attached to the vault. Each tag is composed of a key and a
     *         value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForVaultResult withTags(java.util.Map<String,String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * The tags attached to the vault. Each tag is composed of a key and a
     * value.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     */
  public ListTagsForVaultResult addTagsEntry(String key, String value) {
    if (null == this.tags) {
      this.tags = new java.util.HashMap<String,String>();
    }
    if (this.tags.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.tags.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Tags.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public ListTagsForVaultResult clearTagsEntries() {
    this.tags = null;
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
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForVaultResult == false) return false;
        ListTagsForVaultResult other = (ListTagsForVaultResult)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTagsForVaultResult clone() {
        try {
            return (ListTagsForVaultResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    