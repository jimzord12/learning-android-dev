# Android Development - Project Structure

1. **manifests**
    - Must have **AndroidManifest.xml** (with precisely that exact name) `app/src/main/AndroidManifest.xml`
    - Provides essential information about the App to:
      - Android build tools
      - Android OS
      - Google Play

2. **java** `(app/src/main/java)`
    - Source code written in Java or Kotlin

3. **res** `(app/src/main/res)` (`res` stands for resources)
   - It can include:
     - colors
     - styles
     - images
     - dimensions
     - etc
   - Important Folders:
     - **drawable**: We add the images here
     - **layout**: We add the UI elements here 
     - **mipmap**: For storing app/launcher icons
     - **values**: This is basically a place to store constant values (localization, translation, pallet colors, settings string, etc.)
     - **values-night**: Here we put the styles

4. **gradle** files:
    - `build.gradle.kts` (Project-level): Configurations for the whole project, base configurations.
    - `build.gradle.kts` (Module(App)-level): Configurations regarding only the App.
