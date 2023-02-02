# Translation Generators

This repository contains two Python scripts that help you easily convert .arb files to .xlsx and vice versa. The scripts are designed to make the process of managing translation files more convenient and efficient.


### Requirements

Before running the scripts, make sure you have installed the following libraries:

- Python 3.x
- os
- csv
- json
- collections
- Tkinter library (pre-installed in most Python installations)
- pandas
- openpyxl
- PIL

You can install the libraries by running the following command in your terminal:
```bash
pip install os csv json collections tkinter pandas openpyxl pillow
#pip3 install os csv json collections tkinter pandas openpyxl pillow
```

## Script 1: 'arb_to_excel.py'

This script helps you generate a translation file in .xlsx format from multiple .arb files in a project folder

Here is the example:
|Arb to Excel                                  |
|:-------------------------------------------: |
|![](arb_to_excel.gif) |

### How To Use 🚀
```bash
python arb_to_excel.py
#python3 arb_to_excel.py
```
This script contains functions to select the root of project folder, parse the ARB files, and generate Excel file. The following steps are performed:
* Select the project folder
* xtract the path of the project folder
* Create a list of all .arb files in the "/lib/l10n" folder
* Parse the contents of the "intl_en.arb" file as a JSON objectt
* Parse the contents of the remaining .arb files as JSON objects and append them to the data dictionary
* Convert the .arb files to an Excel file and save it in the "/lib/l10n" folder

## Script 2: 'excel_to_arb.py'

This script helps you generate multiple .arb files from an excel file. If a value doesn't exist, the corresponding key-value pair will not be present in the .arb file. The steps taken by the script are:

Here is the example:
|Excel to Arb                                  |
|:-------------------------------------------: |
|![](excel_to_arb.gif) |

### How To Use 🚀
```bash
python excel_to_arb.py
#python3 excel_to_arb.py
```
This script contains functions to select the excel file, select destination folder where .arb files will be saved. The following steps are performed:
* Select the .xlsx file
* Select the destination folder where .arb files will be sabed
* Convert the excel file to a CSV file and then to a dictionary
* Generate .arb files for different languages using the dictionary

 
# Contributors ✨

<a href="https://hr.linkedin.com/in/adrijanomicevic"><img src="https://media-exp1.licdn.com/dms/image/C4E03AQGrVjCdENO4Bg/profile-displayphoto-shrink_200_200/0/1648504265358?e=2147483647&v=beta&t=bZ5pols8a-FTl7Q4F6ADIbt4Hagl66Cg_5aS7eeT5Ig" width="100px;"><br /><sub><b>Adrijan Omićević</b></sub></a>

