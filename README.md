# Market App

## Overview
Market App is an Android application built using Java and RecyclerView. It displays a list of scrollable items, and when an item is clicked, a toast message appears, indicating the selected item.

## Screenshots

# Home-page
![Image](https://github.com/user-attachments/assets/dd762614-1913-43b4-85fb-f3802bf08f7f)

# selected-item
![Image](https://github.com/user-attachments/assets/6841a030-dc2c-43b1-b407-c9191d67f4f9)


## Features
- Displays a list of items using RecyclerView.
- Shows a toast message upon clicking an item.
- Uses a custom adapter (`MyCustomAdapter`) for better UI handling.

## Technologies Used
- **Java** (Primary language)
- **RecyclerView** (For list display)
- **Android Studio** (Development IDE)

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/MaddyRizvi/grocery-app
   ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Usage
1. Launch the app.
2. View the list of market items.
3. Tap on an item to see a toast message with the item's name.

## File Structure
```
/MarketApp
│-- app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/marketapp/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── MyCustomAdapter.java
│   │   │   ├── res/layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   ├── item_layout.xml
│   ├── AndroidManifest.xml
```


## Contribution
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m "Describe changes"`).
4. Push to your branch (`git push origin feature-branch`).
5. Open a pull request with a clear description of the changes.

## License
This project is open-source and should only be used for learning purpose. :)

## Author
- **Maddy Rizvi** - https://github.com/MaddyRizvi/grocery-app
