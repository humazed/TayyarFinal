/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-02-15 17:18:02 UTC)
 * on 2017-08-07 at 03:57:29 UTC 
 * Modify at your own risk.
 */

package backend.myApi.model;

/**
 * Model definition for Customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Customer extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location currentLocation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageURl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numberOfOrders;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regTokenList;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalAmountOfMoneySpent;

  /**
   * @return value or {@code null} for none
   */
  public Location getCurrentLocation() {
    return currentLocation;
  }

  /**
   * @param currentLocation currentLocation or {@code null} for none
   */
  public Customer setCurrentLocation(Location currentLocation) {
    this.currentLocation = currentLocation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public Customer setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Customer setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageURl() {
    return imageURl;
  }

  /**
   * @param imageURl imageURl or {@code null} for none
   */
  public Customer setImageURl(java.lang.String imageURl) {
    this.imageURl = imageURl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainAddress() {
    return mainAddress;
  }

  /**
   * @param mainAddress mainAddress or {@code null} for none
   */
  public Customer setMainAddress(java.lang.String mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Customer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumberOfOrders() {
    return numberOfOrders;
  }

  /**
   * @param numberOfOrders numberOfOrders or {@code null} for none
   */
  public Customer setNumberOfOrders(java.lang.Integer numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhone() {
    return phone;
  }

  /**
   * @param phone phone or {@code null} for none
   */
  public Customer setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegTokenList() {
    return regTokenList;
  }

  /**
   * @param regTokenList regTokenList or {@code null} for none
   */
  public Customer setRegTokenList(java.util.List<java.lang.String> regTokenList) {
    this.regTokenList = regTokenList;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalAmountOfMoneySpent() {
    return totalAmountOfMoneySpent;
  }

  /**
   * @param totalAmountOfMoneySpent totalAmountOfMoneySpent or {@code null} for none
   */
  public Customer setTotalAmountOfMoneySpent(java.lang.Double totalAmountOfMoneySpent) {
    this.totalAmountOfMoneySpent = totalAmountOfMoneySpent;
    return this;
  }

  @Override
  public Customer set(String fieldName, Object value) {
    return (Customer) super.set(fieldName, value);
  }

  @Override
  public Customer clone() {
    return (Customer) super.clone();
  }

}
