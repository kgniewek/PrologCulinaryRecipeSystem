# 2022 Group Prolog Project

## Prolog Culinary Recipe System

### Project Description
This project involves the creation of an Expert System (SE) developed in Prolog, which assists users in determining if they can prepare a dish based on the recipes available. The system allows for the querying of available dishes, displaying recipes, and checking for necessary ingredients using user input. It leverages data prepared from an existing dataset of recipes and ingredients, providing a practical application of Artificial Intelligence in the culinary domain.

### Technologies / Tools Used
- **Prolog**: Primary programming language used for creating the expert system logic.
- **Java**: Used for pre-processing data files to make them suitable for Prolog consumption.
- **File Handling in Java**: Managing and transforming recipe data.

### Team Collaboration
This project was a collaborative effort involving three team members. It provided a valuable experience in IT project management, including task division, integration of individual contributions, and effective teamwork. Our collaboration concluded with a presentation showcasing our achievements in this project.

### Key Features
1. **Listing Dishes**: Users can query the system to display a list of all dishes for which recipes are available.
2. **Displaying Recipes**: The system provides the recipe for any selected dish.
3. **Ingredient Check**: Upon querying about a dish, the system interacts with the user to check for the availability of required ingredients.
4. **Memory Feature**: The system remembers previously confirmed ingredients, reducing redundancy in subsequent queries.
5. **Customizable Ingredient Queries**: There is an option to adjust which ingredients the system should inquire about, allowing for flexible user interaction.

### Files Included
- `projekt.pl`: Main Prolog file containing the logic for the expert system.
- `all_ingredients(sample).txt`: Sample list of ingredients.
- `content_of_recipes(sample).txt`: Content details for recipes.
- `ingredients_of_recipes(sample).txt`: Mapping of dishes to their ingredients.
- `ingredients_of_recipes_alt(sample).txt`: Alternative ingredient listings.
- `src/FileHelper.java`: Java utility for reading and writing ingredient files.
- `src/Main.java`: Main Java file to execute file handling operations.

### Project Setup and Execution
To run this project, ensure Prolog and Java are installed on your system. Start by processing the data files using the Java program in the `src` directory to format them appropriately for Prolog. Then, load the `projekt.pl` file in your Prolog environment to interact with the system.

### Data Handling
The project uses pre-existing recipe and ingredient data, which was parsed and prepared using Java. This preprocessing was necessary to ensure compatibility with Prolog's requirements and to streamline the user experience within the expert system.

### Project Structure
- 📁 **root**
  - `all_ingredients(sample).txt`
  - `content_of_recipes(sample).txt`
  - `ingredients_of_recipes(sample).txt`
  - `ingredients_of_recipes_alt(sample).txt`
  - `projekt.pl`
  - 📁 **src**
    - `FileHelper.java`
    - `Main.java`


### Conclusion and Presentation
The project culminated in a successful presentation, where we demonstrated the functionality of the system and discussed our learning experiences regarding teamwork and the application of programming skills in a real-world-like scenario. The feedback was incorporated to refine the system further.
