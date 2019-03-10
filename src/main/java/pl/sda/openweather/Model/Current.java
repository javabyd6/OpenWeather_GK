package pl.sda.openweather.Model;


public class Current {

   private String last_updated_epoch;
   private String last_updated;
   private int temp_c;

   public Current (){

   }

   public String getLast_updated_epoch() {
      return last_updated_epoch;
   }

   public void setLast_updated_epoch(String last_updated_epoch) {
      this.last_updated_epoch = last_updated_epoch;
   }

   public String getLast_updated() {
      return last_updated;
   }

   public void setLast_updated(String last_updated) {
      this.last_updated = last_updated;
   }

   public int getTemp_c() {
      return temp_c;
   }

   public void setTemp_c(int temp_c) {
      this.temp_c = temp_c;
   }

   public int getTemp_f() {
      return temp_f;
   }

   public void setTemp_f(int temp_f) {
      this.temp_f = temp_f;
   }

   public int getIs_day() {
      return is_day;
   }

   public void setIs_day(int is_day) {
      this.is_day = is_day;
   }

   public Condition getCondition() {
      return condition;
   }

   public void setCondition(Condition condition) {
      this.condition = condition;
   }

   public double getWind_mph() {
      return wind_mph;
   }

   public void setWind_mph(double wind_mph) {
      this.wind_mph = wind_mph;
   }

   public double getWind_kph() {
      return wind_kph;
   }

   public void setWind_kph(double wind_kph) {
      this.wind_kph = wind_kph;
   }

   public int getWind_degree() {
      return wind_degree;
   }

   public void setWind_degree(int wind_degree) {
      this.wind_degree = wind_degree;
   }

   public String getWind_dir() {
      return wind_dir;
   }

   public void setWind_dir(String wind_dir) {
      this.wind_dir = wind_dir;
   }

   public int getPressure_mb() {
      return pressure_mb;
   }

   public void setPressure_mb(int pressure_mb) {
      this.pressure_mb = pressure_mb;
   }

   public double getPressure_in() {
      return pressure_in;
   }

   public void setPressure_in(double pressure_in) {
      this.pressure_in = pressure_in;
   }

   public double getPrecip_mm() {
      return precip_mm;
   }

   public void setPrecip_mm(double precip_mm) {
      this.precip_mm = precip_mm;
   }

   public double getPrecip_in() {
      return precip_in;
   }

   public void setPrecip_in(double precip_in) {
      this.precip_in = precip_in;
   }

   public int getHumidity() {
      return humidity;
   }

   public void setHumidity(int humidity) {
      this.humidity = humidity;
   }

   public int getCloud() {
      return cloud;
   }

   public void setCloud(int cloud) {
      this.cloud = cloud;
   }

   public double getFeelslike_c() {
      return feelslike_c;
   }

   public void setFeelslike_c(double feelslike_c) {
      this.feelslike_c = feelslike_c;
   }

   public double getFeelslike_f() {
      return feelslike_f;
   }

   public void setFeelslike_f(double feelslike_f) {
      this.feelslike_f = feelslike_f;
   }

   public int getVis_km() {
      return vis_km;
   }

   public void setVis_km(int vis_km) {
      this.vis_km = vis_km;
   }

   public int getVis_miles() {
      return vis_miles;
   }

   public void setVis_miles(int vis_miles) {
      this.vis_miles = vis_miles;
   }

   public int getUv() {
      return uv;
   }

   public void setUv(int uv) {
      this.uv = uv;
   }

   public Current(String last_updated_epoch, String last_updated, int temp_c, int temp_f, int is_day, Condition condition, double wind_mph, double wind_kph, int wind_degree, String wind_dir, int pressure_mb, double pressure_in, double precip_mm, double precip_in, int humidity, int cloud, double feelslike_c, double feelslike_f, int vis_km, int vis_miles, int uv) {
      this.last_updated_epoch = last_updated_epoch;
      this.last_updated = last_updated;
      this.temp_c = temp_c;
      this.temp_f = temp_f;
      this.is_day = is_day;
      this.condition = condition;
      this.wind_mph = wind_mph;
      this.wind_kph = wind_kph;
      this.wind_degree = wind_degree;
      this.wind_dir = wind_dir;
      this.pressure_mb = pressure_mb;
      this.pressure_in = pressure_in;
      this.precip_mm = precip_mm;
      this.precip_in = precip_in;
      this.humidity = humidity;
      this.cloud = cloud;
      this.feelslike_c = feelslike_c;
      this.feelslike_f = feelslike_f;
      this.vis_km = vis_km;
      this.vis_miles = vis_miles;
      this.uv = uv;
   }

   int temp_f;
   int is_day;
   Condition condition;
   double wind_mph;
   double wind_kph;
   int wind_degree;
   String wind_dir;
   int pressure_mb;
   double pressure_in;
   double precip_mm;
   double precip_in;
   int humidity;
   int cloud;
   double feelslike_c;
   double feelslike_f;
   int vis_km;
   int vis_miles;
   int uv;

}
