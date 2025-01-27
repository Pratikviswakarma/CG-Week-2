package ridehailingapplication;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}