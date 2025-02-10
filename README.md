Simple Dice Roller server application, that can take a payload as either JSON or XML, then return the configured dice rolls as JSON or XML (depending on the sent object).

For example, a simple JSON payload for 3 d6 would look like

{
    "dice": [
        {
            "sides": 6
        },
        {
            "sides": 6
        },
        {
            "sides": 6
        }
    ]
}

the return payload then would be

{
    "rolls": [
        {
            "sides": 6,
            "type": "d6",
            "result": 3,
        },
        {
            "sides": 6,
            "type": "d6",
            "result": 1,
        },
        {
            "sides": 6,
            "type": "d6",
            "result": 6,
        },
    ]
}

For XML the result could look like